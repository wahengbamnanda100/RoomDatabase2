package com.example.roomdatabase2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Visitor {


    @PrimaryKey


    @ColumnInfo(name = "Visitor_Name")
    @NonNull
    String name;


    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @ColumnInfo(name = "Visitor_Email")
    @NonNull
    String email;


    @ColumnInfo(name = "Visitor_PhNum")
    @NonNull
    String Phone_number;


    @ColumnInfo(name = "Visitor_Nationality")
    @NonNull
    String Nationality;


    @ColumnInfo(name = "Visitor_IdType")
    @NonNull
    String V_IdType;

    @ColumnInfo(name = "Visitor_Gender")
    @NonNull
    String V_Gender;


    @NonNull
    public String getV_Gender() {
        return V_Gender;
    }
    public void setV_Gender(@NonNull String v_Gender) {
        V_Gender = v_Gender;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return Phone_number;
    }

    public void setPhone_number(String phone_number) {
        Phone_number = phone_number;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getV_IdType() {
        return V_IdType;
    }

    public void setV_IdType(String v_IdType) {
        V_IdType = v_IdType;
    }

    public String getV_IdNum() {
        return V_IdNum;
    }

    public void setV_IdNum(String v_IdNum) {
        V_IdNum = v_IdNum;
    }

    @ColumnInfo(name = "Visitor_IdNum")
    @NonNull
    String V_IdNum;


    @NonNull
    public String getCompany() {
        return company;
    }

    public void setCompany(@NonNull String company) {
        this.company = company;
    }

    @ColumnInfo(name = "Visitor_Company")
    @NonNull
    String company;
}
