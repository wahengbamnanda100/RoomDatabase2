package com.example.roomdatabase2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,SubmitFragment.DialogButtonListener,CancelFragment.DialogButtonListener2 {

    EditText etName, etEmail, etPhNum, etNationality, etType, etGID, etCompany;
    RadioGroup radioGroup;
    RadioButton radioButton;
    ImageView imageView, imageView2;

    FragmentManager fragmentManager;

    VisitorDao visitorDao;
    VisitorDatabase visitorDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fragmentManager = getSupportFragmentManager();


        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhNum = findViewById(R.id.etPhNum);
        etNationality = findViewById(R.id.etCompany);
        etType = findViewById(R.id.etNationality);
        etGID = findViewById(R.id.etGID);
        etCompany = findViewById(R.id.etType);
        imageView = findViewById(R.id.iv);
        imageView2 = findViewById(R.id.iv2);
        radioGroup = findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(this);

        visitorDatabase = VisitorDatabase.getInstance(this);
        visitorDao = visitorDatabase.getVisitorDao();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {
        radioButton = findViewById(i);
        String gender = radioButton.getText().toString();
        radioButton.setText(gender);
    }

    public void photo(View view) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 123);
    }

    public void photo2(View view) {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 123);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (resultCode == RESULT_OK) {
            Bundle bundle = intent.getExtras();
            Bitmap bitmap = (Bitmap) bundle.get("data");
            imageView.setImageBitmap(bitmap);
        } else {
            if (requestCode == 456) {
                Bundle bundle = intent.getExtras();
                Bitmap bitmap = (Bitmap) bundle.get("data2");
                imageView2.setImageBitmap(bitmap);
            }
        }
    }

    public void submit(View view) {

        SubmitFragment submitFragment = new SubmitFragment();
        submitFragment.show(fragmentManager, "Alert Dialog");
    }

    @Override
    public void listenToDialogButton(String str) {

        if (str.equals("Yes")) {

            Visitor visitor = new Visitor();
            visitor.setName(etName.getText().toString());
            visitor.setEmail(etEmail.getText().toString());
            visitor.setPhone_number(etPhNum.getText().toString());
            visitor.setNationality(etNationality.getText().toString());
            visitor.setV_IdType(etType.getText().toString());
            visitor.setV_IdNum(etGID.getText().toString());
            visitor.setCompany(etCompany.getText().toString());
            visitor.setV_Gender(radioButton.getText().toString());

            visitorDao.insert(visitor);

            MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.audio);
            mediaPlayer.start();

            Intent intent = new Intent(this,PersonActivity.class);
            startActivity(intent);


        }
    }

    public void cancel(View view) {

        CancelFragment cancelFragment = new CancelFragment();
        cancelFragment.show(fragmentManager, "Alert Dialog");
    }

    @Override
    public void listenToDialogButton2(String str) {


        if (str.equals("Yes")) {

            etName.setText("");
            etEmail.setText("");
            etPhNum.setText("");
            etNationality.setText("");
            etType.setText("");
            etGID.setText("");
            etCompany.setText("");


            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }
    }
}
