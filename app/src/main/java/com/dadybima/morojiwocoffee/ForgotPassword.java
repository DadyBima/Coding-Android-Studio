package com.dadybima.morojiwocoffee;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPassword extends AppCompatActivity {
    EditText editTextEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);
        editTextEmail = findViewById(R.id.username);
    }

    public void postSendRequest (View view){
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Masukkan Alamat Email", Toast.LENGTH_LONG).show();
        }
        else if (!isValidEmail(editTextEmail.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Email Tidak Valid", Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(ForgotPassword.this, ResetPassword.class);
            startActivity(i);
        }
    }

    public static boolean isValidEmail (CharSequence email){
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
