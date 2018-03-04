package com.example.kanchanpanda.todoapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SpashScreen extends AppCompatActivity {
    private static int Splash_Time_Out=4000;
    private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);
        image=(ImageView)findViewById(R.id.iv);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(SpashScreen.this,MainActivity.class);
                startActivity(home);
                finish();
            }
        },Splash_Time_Out);
    }
}
