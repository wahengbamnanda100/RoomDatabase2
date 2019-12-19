package com.example.roomdatabase2;


import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface VisitorDao2 {

    @Insert
    public void insert2(Visitor2 visitor2);
}
