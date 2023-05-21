package in.softface.raghavan.freeskills.login;


import android.content.Context;
import android.content.Intent;
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
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import java.util.Objects;

import in.softface.raghavan.freeskills.MainActivity;
import in.softface.raghavan.freeskills.R;

public class Sign_up_Activity extends AppCompatActivity {
    private GoogleSignInClient client;
    SignInButton signinbtn;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Objects.requireNonNull(getSupportActionBar()).hide();
        signinbtn = findViewById(R.id.bt_sign_in);
         progressBar = (ProgressBar) findViewById(R.id.progressBar);
        GoogleSignInOptions options = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();
        client = GoogleSignIn.getClient(this,options);
        signinbtn.setOnClickListener(view -> {
            Intent i = client.getSignInIntent();
            startActivityForResult(i,1234);

        });

    }
    boolean conneting() {
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        return (connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1234){

            try {

                    Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
                    GoogleSignInAccount account = task.getResult(ApiException.class);

                    AuthCredential credential = GoogleAuthProvider.getCredential(account.getIdToken(), null);
                    FirebaseAuth.getInstance().signInWithCredential(credential)
                            .addOnCompleteListener(task1 -> {
                                progressBar.setVisibility(View.VISIBLE);
                                signinbtn.setVisibility(View.INVISIBLE);

                                if (task1.isSuccessful()) {
                                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(intent);

                                } else {
                                    if (conneting()) {
                                        Toast.makeText(Sign_up_Activity.this, Objects.requireNonNull(task1.getException()).getMessage(), Toast.LENGTH_SHORT).show();
                                    } else {
                                        Toast.makeText(Sign_up_Activity.this,"Turn On Your Mobile Data , Just For First Time Login",Toast.LENGTH_LONG).show();

                                    }
                                }

                            });


            }
            catch (ApiException e) {
                e.printStackTrace();
            }

        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if(user!= null){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }
    }

}