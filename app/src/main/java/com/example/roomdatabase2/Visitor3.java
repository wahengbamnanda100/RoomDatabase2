package com.example.roomdatabase2;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Visitor3 {

    @PrimaryKey

    @ColumnInfo(name = "Visitor_Person3")
    @NonNull
    String Person3;

    @NonNull
    public String getPerson3() {
        return Person3;
    }

    public void setPerson3(@NonNull String person3) {
        Person3 = person3;
    }
}
