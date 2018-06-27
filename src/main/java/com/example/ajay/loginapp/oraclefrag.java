package com.example.ajay.loginapp;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class oraclefrag extends Fragment
{
    View view;
    TextView tv1,tv2,tv3;
    Activity context;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_oraclefrag,container,false);
        tv1=(TextView)view.findViewById(R.id.tv1);

        String str=Integer.toString(radiocheck.answer)+ " Marks out of 12";

        tv1.setText(str);
        radiocheck.answer=0;

        // Inflate the layout for this fragment
        return view;
    }




}
