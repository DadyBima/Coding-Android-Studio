package com.udinus.a43ug_a11202013065_nurulismawati_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {
    EditText editTextnumber;
    EditText editTextPassword;
    EditText editTextPassword2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        //Binding edt_reset_code ke variabel
        editTextnumber = findViewById(R.id.edt_reset_code);

        //Binding edt_new_password ke variabel
        editTextPassword = findViewById(R.id.edt_new_password);

        //Binding edt_confirm_password ke variabel
        editTextPassword2 = findViewById(R.id.edt_confirm_password);
    }

    public void postChangePassword (View view){
        // Validasi input kode dan password
        if(TextUtils.isEmpty(editTextnumber.getText().toString().trim())
                &&
                TextUtils.isEmpty(editTextPassword.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Masukkan Kode dan Password",Toast.LENGTH_LONG).show();
        }
        // Validasi input kedua password kosong
        else if(TextUtils.isEmpty(editTextPassword.getText().toString().trim())
                &&
                TextUtils.isEmpty(editTextPassword2.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Password dan Confirm Password Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
        }
        // Validasi input kode kosong
        else if(TextUtils.isEmpty(editTextnumber.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Masukkan Kode Anda", Toast.LENGTH_LONG).show();
        }
        // Validasi password kosong
        else if (TextUtils.isEmpty(editTextPassword.getText().toString())) {
            Toast.makeText(view.getContext(), "Masukkan Password Baru Anda", Toast.LENGTH_LONG).show();
        }
        // Validasi new password (confirm)
        else if (TextUtils.isEmpty(editTextPassword2.getText().toString())) {
            Toast.makeText(view.getContext(), "Mohon Konfirmasi Password Anda", Toast.LENGTH_LONG).show();
        }
        // Validasi new password == confirm password
        else if (!editTextPassword.getText().toString().equals(editTextPassword2.getText().toString())){
            Toast.makeText(view.getContext(), "Password dan Confirm Password Tidak Sesuai", Toast.LENGTH_SHORT).show();
        }
        else {
            Intent i = new Intent(ResetPassword.this, SuksesResetPassword.class);
            startActivity(i);
        }
    }
}