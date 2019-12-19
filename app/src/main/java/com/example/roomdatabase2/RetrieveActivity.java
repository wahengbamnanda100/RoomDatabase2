package com.example.roomdatabase2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RetrieveActivity extends AppCompatActivity {
    EditText etPhNum;
    TextView tvName,tvEmail,tvPhNum,tvNationality,tvType,tvGID,tvCompany,tvGender;

    VisitorDao visitorDao;
    VisitorDatabase visitorDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);

        etPhNum = findViewById(R.id.etPhNum);

        tvName = findViewById(R.id.tvName);
        tvEmail = findViewById(R.id.tvEmail);
        tvPhNum = findViewById(R.id.tvPhNum);
        tvNationality = findViewById(R.id.tvNationality);
        tvType = findViewById(R.id.tvType);
        tvGID = findViewById(R.id.tvGID);
        tvCompany = findViewById(R.id.tvCompany);
        tvGender = findViewById(R.id.tvGender);


        visitorDatabase = VisitorDatabase.getInstance(this);
        visitorDao = visitorDatabase.getVisitorDao();
    }

    public void enter(View view) {

        Visitor visitor = visitorDao.retrieveByNum(etPhNum.getText().toString());

        tvName.setText(visitor.getName());
        tvEmail.setText(visitor.getEmail());
        tvPhNum.setText(visitor.getPhone_number());
        tvNationality.setText(visitor.getNationality());
        tvType.setText(visitor.getV_IdType());
        tvGID.setText(visitor.getV_IdNum());
        tvCompany.setText(visitor.getCompany());
        tvGender.setText(visitor.getV_Gender());
    }

    public void confirm(View view) {

        Intent intent = new Intent(RetrieveActivity.this,LastActivity.class);
        startActivity(intent);
    }
}
