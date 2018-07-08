package com.example.patryk.helloworld;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.telephony.TelephonyManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void signupButton_onClick(View view){
        Intent intent = new Intent(MainActivity.this,ContactListActivity.class);
        EditText name = (EditText)findViewById(R.id.nameText);
        EditText surname = (EditText)findViewById(R.id.surnameText);
        EditText password = (EditText)findViewById(R.id.passwordText);
       // TelephonyManager telephonyManager;
        //telephonyManager=(TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        String number="";// telephonyManager.getDeviceId();
        signup_data signup_data = new signup_data(number,name.getText().toString(), surname.getText().toString(),password.getText().toString() );
        // convert to json and send to server
        // connect with server
        // send object signup_data to server

        startActivity(intent);
    }
}
