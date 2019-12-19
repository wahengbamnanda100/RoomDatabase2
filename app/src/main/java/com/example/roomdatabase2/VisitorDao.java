package com.example.roomdatabase2;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface VisitorDao {

    @Insert
    public void insert(Visitor visitor);


    @Query("Select * from Visitor where Visitor_PhNum = :PhNum")
    public  Visitor retrieveByNum(String PhNum);
}
