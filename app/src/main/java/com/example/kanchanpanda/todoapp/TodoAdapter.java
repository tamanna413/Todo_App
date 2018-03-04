package com.example.kanchanpanda.todoapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KanchanPanda on 24/02/18.
 */

public class TodoAdapter extends ArrayAdapter<TodoItem> {
    private Context context;
    private ArrayList<TodoItem> itemArrayList;

    public TodoAdapter(@NonNull Context context, ArrayList<TodoItem> itemArrayList) {
        super(context,R.layout.activity_main,itemArrayList);
        this.itemArrayList = itemArrayList;
        this.context=context;
    }



    public View getView(int position,View convertView,ViewGroup parent){

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        TodoItem currentTodoItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID title.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);

        titleTextView.setText(currentTodoItem.getTitle());
        // Find the TextView in the list_item.xml layout with the ID sample_text.

        TextView sampleTextView = (TextView)listItemView.findViewById(R.id.sample_text);
        // Get the default translation from the currentTodoItem object and set this text on the default TextView.

        sampleTextView.setText(currentTodoItem.getDescription());

        return listItemView;
    }
}
