package com.example.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        new AlertDialog.Builder(this)

                .setIcon(R.drawable.ic_ds)
                .setTitle("Be Alert")
                .setMessage("Follw social Distancing")
                .setNeutralButton("ok",new DialogInterface.OnClickListener()    {

            public void onClick(DialogInterface dialog,int which) {
                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
            }
        }).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}