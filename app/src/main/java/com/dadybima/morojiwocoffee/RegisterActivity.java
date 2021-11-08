package com.dadybima.morojiwocoffee;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private EditText namaLengkap,username,password;
    SharedPreferences save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        namaLengkap = findViewById(R.id.namaLengkap);
        username = findViewById(R.id.usernameRegis);
        password = findViewById(R.id.passwordRegis);
        save = getSharedPreferences("login_key", MODE_PRIVATE);
    }
    public void Submit(View view) {
        String saved_nama = namaLengkap.getText().toString();
        String saved_username = username.getText().toString();
        String saved_pass = password.getText().toString();

        SharedPreferences.Editor editor = save.edit();
        editor.putString("namaLengkap", saved_nama);
        editor.putString("username", saved_username);
        editor.putString("password", saved_pass);
        editor.apply();
        Toast.makeText(this, "Akun Terdaftar ! Silakan Login !",Toast.LENGTH_LONG).show();
        Intent gotologin = new Intent(this, LoginActivity.class);
        startActivity(gotologin);
    }
    public void Reset(View view) {
        namaLengkap.setText("");
        username.setText("");
        password.setText("");
    }
}