package com.example.ajay.loginapp;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.FragmentActivity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by apple on 11/26/2017.
 */

public class Result extends AppCompatActivity
{
        Button c;

        Activity context;
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.result);
            c=(Button)findViewById(R.id.click);
            c.setOnClickListener(new View.OnClickListener()
            {

                @Override
                public void onClick(View arg0)
                {
                    oraclefrag ob=new oraclefrag();
                    android.support.v4.app.FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
                    ft.replace(R.id.f1, ob);
                    ft.commit();
                    Toast.makeText(Result.this," "+radiocheck.answer+"out of 12",Toast.LENGTH_SHORT).show();

                }
            });
        }



}
