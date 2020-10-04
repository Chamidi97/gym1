package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Profile extends AppCompatActivity {

    Button chngePwd,accSet;
    DatabaseReference reff2;
    Button deac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        chngePwd = (Button)findViewById(R.id.btn_change_pwd);
        chngePwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Profile.this, ChangePwd.class);
                startActivity(intent);
            }
        });

        accSet = (Button)findViewById(R.id.btn_account_setting);
        accSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Profile.this, AccountSetting.class);
                startActivity(intent);
            }
        });

        deac = (Button)findViewById(R.id.btn_deactivate);
        reff2 = FirebaseDatabase.getInstance().getReference("Users");
        deac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff2.child(VariableClass.phoneNo).removeValue();
                Intent intent =new Intent(Profile.this, Register.class);
                startActivity(intent);
            }
        });
    }
}
