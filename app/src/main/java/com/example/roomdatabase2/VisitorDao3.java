package com.example.roomdatabase2;


import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface VisitorDao3 {

    @Insert
    public void insert3(Visitor3 visitor3);

}
