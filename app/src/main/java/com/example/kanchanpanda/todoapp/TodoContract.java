package com.example.kanchanpanda.todoapp;

import android.provider.BaseColumns;

/**
 * Created by KanchanPanda on 01/03/18.
 */

class TodoContract {
    public static class TodoEntry implements BaseColumns {
        public static final String TABLE_NAME = "Todos";
        public static final String COLUMN_TODO_ID = "id";
        public static final String COLUMN_TODO_TITLE = "title";
        public static final String COLUMN_TODO_SAMPLE_TEXT = "sampletext";
    }
}
