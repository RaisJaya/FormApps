package com.raisjayadevelop.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById((R.id.idInputNama));
        EditText inputEmail = (EditText) findViewById((R.id.idInputEmail));
        EditText inputPhone = (EditText) findViewById((R.id.idInputPhone));
        EditText inputPassword = (EditText) findViewById((R.id.eidInputPwd));

        Button btnSave = (Button) findViewById(R.id.idButtonSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Kode aksi dari eksekusi klik button

                Log.d(getPackageName()+" Nama", inputName.getText().toString());
                Log.d(getPackageName()+" Email", inputEmail.getText().toString());
                Log.d(getPackageName()+" Phone", inputPhone.getText().toString());
                Log.d(getPackageName()+" Password", inputPassword.getText().toString());

            }
        });

    }
}