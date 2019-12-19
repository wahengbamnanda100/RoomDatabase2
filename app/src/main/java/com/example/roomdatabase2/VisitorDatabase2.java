package com.example.roomdatabase2;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Visitor2.class},version = 1,exportSchema = false)

public abstract class VisitorDatabase2 extends RoomDatabase {


    private static VisitorDatabase2 database2;

    public abstract VisitorDao2 getVisitorDao();

    public static VisitorDatabase2 getInstance(Context context) {


        if (database2 == null) {
            database2 = Room.databaseBuilder(context.getApplicationContext(), VisitorDatabase2.class, "University.db").allowMainThreadQueries().build();
        }

        return database2;
    }

}
