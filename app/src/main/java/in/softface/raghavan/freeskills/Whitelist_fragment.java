/*
 *   *************************************************************
 *   Created by Raghavan at softface.in on 21/07/23, 8:39 pm
 *    funwithmetamil@gmail.com
 *     Last modified 21/07/23, 8:39 pm
 *     Copyright (c) 2023.
 *     All rights reserved.
 *   *************************************************************
 */

package in.softface.raghavan.freeskills;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;

import in.softface.raghavan.freeskills.messageshower.dialog_loading;
import in.softface.raghavan.freeskills.recycleviews.recycleviewforwhitelist;

public class Whitelist_fragment extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    recycleviewforwhitelist rw;
    RecyclerView re;
    TextView count;
    Button clearall;
    LinearLayout nofound;
    dialog_loading dl;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_whitelist_fragment);
        setTitle("Whitelist");
        //dl = new dialog_loading(getActivity(),2000);
        sharedPreferences = getSharedPreferences("UserData", Context.MODE_PRIVATE);
        //dl.dismiss();
        clearall = findViewById(R.id.clearall);
        count = findViewById(R.id.count);
        nofound = findViewById(R.id.nofound);
        clearall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.remove("whitelist");
                editor.apply();
                recreateActivity();
            }
        });
        if (getwhitelistdata().isEmpty()) {
            nofound.setVisibility(View.VISIBLE);
        } else {
            nofound.setVisibility(View.GONE);
        }
        count.setText(getwhitelistdata().size() + " " + "Items");
        re = findViewById(R.id.ray);
        re.setLayoutManager(new LinearLayoutManager(getBaseContext(), LinearLayoutManager.VERTICAL, false));
        rw = new recycleviewforwhitelist(this, getBaseContext(), getwhitelistdata());
        re.setAdapter(rw);
        re.scrollToPosition(rw.getItemCount() - 1);
    }

    private ArrayList<String> getwhitelistdata() {
        String json = sharedPreferences.getString("whitelist", "null");
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<String>>() {
        }.getType();
        ArrayList<String> list = gson.fromJson(json, type);
        Log.d("list", "onClick: " + list);
        if (list == null) {
            list = new ArrayList<>();
        }
        return list;
    }

    private void recreateActivity() {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
}