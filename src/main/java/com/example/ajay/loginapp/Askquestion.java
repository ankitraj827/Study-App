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

import java.io.FileNotFoundException;
import java.io.OutputStreamWriter;

public class Askquestion extends AppCompatActivity {
    EditText e1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_askquestion);
        WriteFile();
    }
    public void WriteFile()
    {
        b1=(Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    OutputStreamWriter out=new OutputStreamWriter(openFileOutput("abc.txt",0));
                    e1=(EditText)findViewById(R.id.e1);
                    out.write(e1.getText().toString());
                    out.close();
                    e1.setText("");
                    e1.setHint("Submit another response");
                    Toast.makeText(Askquestion.this,"Your question recorded successfully,we will reply you in sometime",Toast.LENGTH_LONG).show();
                }
                catch(FileNotFoundException e)
                {
                    e.printStackTrace();
                }
                catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
