package com.example.roomdatabase2;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Visitor.class},version = 1,exportSchema = false)

public abstract class VisitorDatabase extends RoomDatabase {

    private static VisitorDatabase database;

    public abstract VisitorDao getVisitorDao();

    public static VisitorDatabase getInstance(Context context) {


        if (database == null) {
            database = Room.databaseBuilder(context.getApplicationContext(), VisitorDatabase.class, "University.db").allowMainThreadQueries().build();
        }

        return database;
    }
}
