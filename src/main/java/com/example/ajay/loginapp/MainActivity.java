package com.example.ajay.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    Button b1,b2;
    EditText user,password;
    int counter=3;
    MyDataBase myDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        user=(EditText)findViewById(R.id.user);
        password=(EditText)findViewById(R.id.pass) ;
        myDataBase=new MyDataBase(MainActivity.this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(MainActivity.this,SignUp.class);
                startActivity(it);
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View arg0) {
                ArrayList<Person> al = new ArrayList<>();
                al = myDataBase.checkValue();
                String name = user.getText().toString().trim();
                String pass = password.getText().toString().trim();
                if (name.equals("") || pass.equals("")) {
                    Toast.makeText(MainActivity.this, "Please fill all the field", Toast.LENGTH_LONG).show();
                } else {
                    int flag = 0;
                    outer:
                    for (int i = 0; i < al.size(); i++) {
                        Person p = al.get(i);
                        if (p.getUsername().equals(name) && p.getPassword().equals(pass)) {
                            flag = 1;
                            break outer;
                        }
                    }
                    if (flag == 1) {
                        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
                        Intent it = new Intent(MainActivity.this, NextPage.class);
                        startActivity(it);
                    } else {
                        Toast.makeText(MainActivity.this, "Login Denied", Toast.LENGTH_LONG).show();
                        user.setText("");
                        password.setText("");
                    }
                }
            }

        });

    }
}
