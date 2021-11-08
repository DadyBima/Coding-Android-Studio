package com.udinus.a43ug_a11202013065_nurulismawati_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class WelcomeBackActivity extends AppCompatActivity {
    EditText editTextEmail;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back);

        editTextEmail = findViewById(R.id.edt_reset_code);
        editTextPassword = findViewById(R.id.edt_reset_pass);
    }

    public void clickForgot (View view){
        Intent i = new Intent(WelcomeBackActivity.this, ForgotPassword.class);
        startActivity(i);
    }

    public void postLogin (View view){
        // Validasi input email dan password kosong
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())
                &&
                TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email dan Password Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
        }
        // Validasi input email kosong
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email Tidak Boleh Kosong!", Toast.LENGTH_LONG).show();
        }
        // Validasi inputan tipe email
        else
            if (!isValidEmail(editTextEmail.getText().toString().trim())){
                Toast.makeText(view.getContext(), "Email Tidak Valid", Toast.LENGTH_LONG).show();
            }
            // Validasi password kosong
            else if (TextUtils.isEmpty(editTextPassword.getText().toString())){
                Toast.makeText(view.getContext(), "Password Tidak Boleh Kosong!", Toast.LENGTH_LONG).show();
            }
            else {
                Intent i = new Intent(WelcomeBackActivity.this, ListBookActivity.class);
                startActivity(i);
            }
    }

    public static boolean isValidEmail (CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}