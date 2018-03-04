package com.example.kanchanpanda.todoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

/**
 * Created by KanchanPanda on 25/02/18.
 */

public class ListItem extends AppCompatActivity {
    TextView titView;
    TextView desView;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_item);
        titView=(TextView)findViewById(R.id.title);
        desView=(TextView)findViewById(R.id.sample_text);
        titView.setText(getTitle());
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }
}
