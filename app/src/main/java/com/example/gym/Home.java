package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;

public class Home extends AppCompatActivity {
Button profile;
    DatabaseReference RootRef;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        tv1 = (TextView)findViewById(R.id.home_username);
        tv1.setText(VariableClass.username);
        profile = (Button) findViewById(R.id.btn_profile);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Home.this, Profile.class);
                startActivity(intent);
            }
        });








    }
}
