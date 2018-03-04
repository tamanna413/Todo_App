package com.example.kanchanpanda.todoapp;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AddItem extends AppCompatActivity {
    private TodoProvider provider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        provider=new TodoProvider(this);
        final EditText title=(EditText) findViewById(R.id.edit_title);
        final EditText description=(EditText)findViewById(R.id.sample_edit_text);
        Button reset=(Button)findViewById(R.id.reset);
        final Button save=(Button)findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(save.isPressed()){
                    String Mytitle=title.getText().toString();
                    String Mydescription=description.getText().toString();
                    title.setText("");
                    description.setText("");
                    provider.createTodo(Mytitle,Mydescription);
                    Toast.makeText(getApplicationContext(),"New Todo added",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(i);
                }
            }

        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Mytitle=title.getText().toString();
                String Mydescription=description.getText().toString();
                title.setText(null);
                description.setText(null);
                provider.createTodo(Mytitle,Mydescription);
                provider.close();
            }
        });
    }

}
