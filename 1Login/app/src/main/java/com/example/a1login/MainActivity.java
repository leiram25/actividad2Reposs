package com.example.a1login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Name, Password;
    private Button Boton1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.Txt_username);
        Password = (EditText) findViewById(R.id.Txt_password);
        Boton1 = (Button) findViewById(R.id.button7);
        Boton1.setOnClickListener(new View.OnClickListener(){

                                      @Override
                                      public void onClick(View view) {
                                          Name.setText("");
                                          Password.setText("");
                                      }
                                  }
        );

    }
    public void Login(View view) {
        String username = Name.getText().toString();
        String password = Password.getText().toString();
        if (username.length() == 0)
        {
            Toast.makeText( this, "Enter a name", Toast.LENGTH_LONG) .show();
        }
        if (password.length() == 0)
        {
            Toast.makeText( this, "Enter password", Toast.LENGTH_LONG) .show();
        }
        if (username.equals("Mariel") && password.equals("1234") ) {
Intent Login = new Intent(this, Main2Activity.class);
startActivity(Login);
        } else {
            Toast.makeText( this, "Either the username or the password is incorrect. Try again.", Toast.LENGTH_LONG) .show();
        }

    }
}