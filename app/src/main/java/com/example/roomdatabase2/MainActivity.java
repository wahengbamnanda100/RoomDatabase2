package com.example.roomdatabase2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;

import android.Manifest;
import android.Manifest.permission;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity{

    EditText etPhNum;

    VisitorDao2 visitorDao2;
    VisitorDatabase2 visitorDatabase2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPhNum = findViewById(R.id.etPhNum);


        visitorDatabase2 = VisitorDatabase2.getInstance(this);
        visitorDao2 = visitorDatabase2.getVisitorDao();


    }

    public void logIn(View view) {

        Visitor2 visitor2 = new Visitor2();
        visitor2.setPhNum2(etPhNum.getText().toString());
        visitorDao2.insert2(visitor2);

        Intent intent = new Intent(this,PersonActivity.class);
        startActivity(intent);
    }

    public void signUp(View view) {

        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void forgot(View view) {
    }
}




