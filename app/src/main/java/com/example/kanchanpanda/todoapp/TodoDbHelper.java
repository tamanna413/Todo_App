
    package com.example.kanchanpanda.todoapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.kanchanpanda.todoapp.TodoContract.TodoEntry.COLUMN_TODO_SAMPLE_TEXT;
import static com.example.kanchanpanda.todoapp.TodoContract.TodoEntry.COLUMN_TODO_TITLE;
import static com.example.kanchanpanda.todoapp.TodoContract.TodoEntry.TABLE_NAME;


    /**
     * Created by KanchanPanda on 01/03/18.
     */

    public class TodoDbHelper extends SQLiteOpenHelper {
        public static final int version= 1;
        public static final String DatabaseName="Todos.db";

        public TodoDbHelper(Context context) {
            super(context, DatabaseName, null, version);
        }



        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS "+TABLE_NAME+" ("
                    +TodoContract.TodoEntry.COLUMN_TODO_ID+ " INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT, "
                    +TodoContract.TodoEntry.COLUMN_TODO_TITLE+ " TEXT NOT NULL, "
                    +TodoContract.TodoEntry.COLUMN_TODO_SAMPLE_TEXT+ " TEXT)");


        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
            onCreate(sqLiteDatabase);
        }


    }


