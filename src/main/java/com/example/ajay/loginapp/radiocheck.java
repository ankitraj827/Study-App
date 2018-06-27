package com.example.ajay.loginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class radiocheck extends AppCompatActivity {
    Button b1;
    RadioButton ja,or,ne,d;
    RadioGroup rg1;
    public static int answer=0;
    public static int countattempted=0;
    public static int countunattempted=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_radiocheck);
        onCheck();
    }
    public void onCheck()
    {
        rg1=(RadioGroup)findViewById(R.id.rg1);
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId=rg1.getCheckedRadioButtonId();
                ja=(RadioButton)findViewById(selectedId);
                or=(RadioButton)findViewById(selectedId);
                ne=(RadioButton)findViewById(selectedId);
                d=(RadioButton)findViewById(selectedId);
                if(ja.getText().toString().equals("JAVA"))
                {
                    Intent it=new Intent(radiocheck.this,Puzzles.class);
                    startActivity(it);
                }
                else if(or.getText().toString().equals("ORACLE"))
                {
                        Intent it=new Intent(radiocheck.this,oracle.class);
                        startActivity(it);
                }
                else if(ne.getText().toString().equals("NETWORKING"))
                {
                    Intent it=new Intent(radiocheck.this,networking.class);
                    startActivity(it);
                }
                else if(d.getText().toString().equals("DATABASE"))
                {
                    Intent it=new Intent(radiocheck.this,database.class);
                    startActivity(it);
                }
            }
        });
    }

}
