package com.example.roomdatabase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PersonActivity extends AppCompatActivity {
    EditText etPerson;

    VisitorDao3 visitorDao3;
    VisitorDatabase3 database3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        etPerson = findViewById(R.id.etPerson);

        database3 = VisitorDatabase3.getInstance(this);
        visitorDao3 = database3.getVisitorDao3();

    }

    public void enter(View view) {

        try {
/*
            Visitor3 visitor3 = new Visitor3();
            String person = etPerson.getText().toString();
            visitor3.setPerson3(person);
            visitorDao3.insert3(visitor3);*/


            Intent intent = new Intent(PersonActivity.this, RetrieveActivity.class);
            startActivity(intent);

        }catch (Exception e){
            Toast.makeText(this,"oOPs! something went wrong",Toast.LENGTH_LONG).show();
        }
    }
}
