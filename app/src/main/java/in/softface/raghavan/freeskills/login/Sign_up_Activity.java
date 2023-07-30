package in.softface.raghavan.freeskills.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import java.util.Objects;

import in.softface.raghavan.freeskills.MainActivity;
import in.softface.raghavan.freeskills.R;
import in.softface.raghavan.freeskills.login.profile.createprofilepackage.CreateProfile;
import in.softface.raghavan.freeskills.messageshower.dialog_loading;

public class Sign_up_Activity extends AppCompatActivity {
    private GoogleSignInClient client;
    SignInButton signinbtn;
    String CUserid;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Objects.requireNonNull(getSupportActionBar()).hide();
        signinbtn = findViewById(R.id.bt_sign_in);
        sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);

        GoogleSignInOptions options = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        client = GoogleSignIn.getClient(this, options);

        signinbtn.setOnClickListener(view -> {
            Intent i = client.getSignInIntent();
            startActivityForResult(i, 1234);
        });

    }

    boolean isConnecting() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1234 && data != null) {
            try {
                Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
                GoogleSignInAccount account = task.getResult(ApiException.class);
                dialog_loading dl = new dialog_loading(this, 1000);
                AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(), null);
                FirebaseAuth.getInstance().signInWithCredential(credential)
                        .addOnCompleteListener(this, new OnCompleteListener() {
                            @Override
                            public void onComplete(Task task1) {

                                CUserid = sharedPreferences.getString("Username", null);
                                dl.show();
                                if (task1.isSuccessful()) {
                                    Intent intent;
                                    if (CUserid == null) {
                                        intent = new Intent(Sign_up_Activity.this, CreateProfile.class);
                                    } else {
                                        intent = new Intent(Sign_up_Activity.this, MainActivity.class);
                                    }
                                    startActivity(intent);
                                } else {
                                    if (isConnecting()) {
                                        Toast.makeText(Sign_up_Activity.this, Objects.requireNonNull(task1.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                                    } else {
                                        dl.dismiss();
                                        Toast.makeText(Sign_up_Activity.this, "Turn On Your Mobile Data, Just For First Time Login", Toast.LENGTH_LONG).show();
                                    }
                                }
                            }
                        });
            } catch (ApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        CUserid = sharedPreferences.getString("Userid", "null");
        if (user != null) {

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}

