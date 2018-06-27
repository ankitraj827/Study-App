package com.example.ajay.loginapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by apple on 11/26/2017.
 */

public class networking extends AppCompatActivity
{
    EditText q1,q2,q3,q4;
    Button sub;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_networking);
        q1=(EditText)findViewById(R.id.first);
        q2=(EditText)findViewById(R.id.second);
        q3=(EditText)findViewById(R.id.third);
        q4=(EditText)findViewById(R.id.fourth);
        sub=(Button)findViewById(R.id.sum);
        sub.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                if(q1.getText().toString().equals("7"))
                {

                    radiocheck.answer++;

                }
                if(q2.getText().toString().equals("data link layer"))
                {

                    radiocheck.answer++;
                }
                if(q3.getText().toString().equals("32"))
                {

                    radiocheck.answer++;
                }
                if(q4.getText().toString().equals("1-126"))
                {

                    radiocheck.answer++;
                }
                Toast.makeText( networking.this," "+"your response has been submitted now you can check your result",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

