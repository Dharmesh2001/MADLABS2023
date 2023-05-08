package com.example.my_image;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isModi= true;
      public void change(View view){
         ImageView iv= findViewById(R.id.imageView2);
         if(isModi){
             iv.setImageResource(R.drawable.img_2);
             isModi=false;
         }else
         {
             iv.setImageResource(R.drawable.img_3);
             isModi=true;
         }

      }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}