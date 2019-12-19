package com.example.roomdatabase2;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Visitor3.class},version = 1,exportSchema = false)
public abstract class VisitorDatabase3 extends RoomDatabase {

    private static VisitorDatabase3 database3;

    public abstract VisitorDao3 getVisitorDao3();

    public static VisitorDatabase3 getInstance(Context context) {

        if(database3 == null){
            database3 = Room.databaseBuilder(context.getApplicationContext(),VisitorDatabase3.class,"University.db").allowMainThreadQueries().build();

        }

        return database3;
    }

}
