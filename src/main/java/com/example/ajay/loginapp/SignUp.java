package com.example.ajay.loginapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    Button b1;
    EditText user,email,pass,mobile;
    MyDataBase myDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        b1=(Button)findViewById(R.id.b1);
        user=(EditText)findViewById(R.id.user);
        email=(EditText)findViewById(R.id.email);
        pass=(EditText)findViewById(R.id.pass);
        mobile=(EditText)findViewById(R.id.phone);
        myDataBase=new MyDataBase(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person p=new Person();
                String string=user.getText().toString().trim();
                String string1=email.getText().toString().trim();
                String string2=pass.getText().toString().trim();
                String string3=mobile.getText().toString().trim();
                if(string.equals("") || string1.equals("") || string2.equals("") || string3.equals(""))
                {
                    Toast.makeText(SignUp.this,"Please fill the above field",Toast.LENGTH_LONG).show();
                }
                else {
                    int mob = Integer.parseInt(mobile.getText().toString().trim());
                    p.setUsername(string);
                    p.setEmail(string1);
                    p.setPassword(string2);
                    p.setMobile_no(mob);
                    myDataBase.insertValue(p);
                }
            }
        });
    }

}
