package com.raisjayadevelop.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final public static String EXTRA_NAME = "extra_nama";
    final public static String EXTRA_EMAIL = "extra_email";
    final public static String EXTRA_PHONE = "extra_phone";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editName = (EditText) findViewById((R.id.idInputNama));
        EditText editEmail = (EditText) findViewById((R.id.idInputEmail));
        EditText editPhone = (EditText) findViewById((R.id.idInputPhone));
        EditText editPassword = (EditText) findViewById((R.id.eidInputPwd));

        Button btnSave = (Button) findViewById(R.id.idButtonSave);
        btnSave.setOnClickListener(v -> {
            Intent loginIntent = new Intent(MainActivity.this, DashboardActivity.class);
            loginIntent.putExtra(EXTRA_NAME, editName, getText().toString());
            loginIntent.putExtra(EXTRA_EMAIL, editEmail, getText().toString());
            loginIntent.putExtra(EXTRA_PHONE, editPhone, getText().toString());
            startActivity(loginIntent);
        });

    }
}