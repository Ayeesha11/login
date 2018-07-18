package com.example.blde.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static EditText username;
    public static EditText password;
    public static Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText) findViewById(R.id.user);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);

    }

    public void lanuchSecondActivity(View view) {
        if(username.getText().toString().equals("ayeesha")&& password.getText().toString().equals("ayeesha")){
            Intent intent = new Intent(this,Second2Activity.class);
            startActivity(intent);
        }else {
            Toast.makeText(this,"Invalide Username or password", Toast.LENGTH_LONG).show();
        }
    }
}
