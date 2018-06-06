package com.patelheggere.myvehiclelive.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.patelheggere.myvehiclelive.R;

public class LoginActivity extends AppCompatActivity {

    EditText mVehicleNumber;
    Button mSubmit;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mVehicleNumber = findViewById(R.id.vehicle_number);
        mSubmit = findViewById(R.id.submit);
        sharedPreferences = getSharedPreferences("Number", MODE_PRIVATE);
        System.out.println("vsdfd"+sharedPreferences.getString("num", null));
        if(sharedPreferences.getString("num", null)!=null)
        {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( mVehicleNumber.getText().toString()!=null) {
                     sharedPreferences= getSharedPreferences("Number", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("num", mVehicleNumber.getText().toString());
                    editor.commit();
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
                else {
                    //mVehicleNumber.requestFocus();
                    Toast.makeText(getApplicationContext(), "Please enter Vehicle Number", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
