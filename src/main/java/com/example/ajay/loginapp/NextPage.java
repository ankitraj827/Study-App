package com.example.ajay.loginapp;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.Animation;

import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by apple on 11/14/2017.
 */

public class NextPage extends AppCompatActivity
{
    Animation Fade_In,Fade_Out;
    ViewFlipper viewFlipper;

    TextView st,puz,res,tv,q;
    Timer tm=new Timer();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextpage);


       // Timer timer=new Timer();
        //timer.scheduleAtFixedRate(new MyTimer(),2000,4000);

        st=(TextView) findViewById(R.id.study);
        st.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View arg0)
            {



                    Intent it1=new Intent(NextPage.this,Subjects.class);
                    startActivity(it1);


            }
        });
        puz=(TextView)findViewById(R.id.puzz);
        puz.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent p=new Intent(NextPage.this,radiocheck.class);
                startActivity(p);
            }
        });
        res=(TextView)findViewById(R.id.res);
        res.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent p=new Intent(NextPage.this,Result.class);
                startActivity(p);
            }
        });
        q=(TextView)findViewById(R.id.q);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(NextPage.this,Askquestion.class);
                startActivity(it);
            }
        });
    }




}

