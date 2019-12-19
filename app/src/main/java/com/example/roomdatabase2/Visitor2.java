package com.example.roomdatabase2;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Visitor2 {

    @PrimaryKey

    @ColumnInfo(name = "Visitor_PhNum2")
    @NonNull
    String phNum2;

    @NonNull

    public void setPhNum2(@NonNull String phNum2) {
        this.phNum2 = phNum2;
    }
}
