package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
       boolean isEgg=true;
       public void change(View view){
           ImageView imageView=findViewById(R.id.imageView);
           ImageView imageView2=findViewById(R.id.imageView2);
           if(isEgg){
               imageView.animate().setDuration(2000).alpha(1);
               imageView2.animate().setDuration(2000).alpha(0);
               isEgg=false;
           }else
           {
               imageView.animate().setDuration(2000).alpha(0);
               imageView2.animate().setDuration(2000).alpha(1);
               isEgg=true;
           }


       }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}