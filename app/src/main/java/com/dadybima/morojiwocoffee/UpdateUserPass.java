package com.dadybima.morojiwocoffee;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class UpdateUserPass extends AppCompatActivity {
    private EditText usernameUp, passwordUp;
    SharedPreferences save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_usernamepass);
        usernameUp = findViewById(R.id.update_username);
        passwordUp = findViewById(R.id.update_pass);
        save = getSharedPreferences("login_key", MODE_PRIVATE);
    }

    public void UpdateUserPass(View view) {
        String saved_username = usernameUp.getText().toString();
        String saved_pass = passwordUp.getText().toString();

        SharedPreferences.Editor editor = save.edit();
        editor.putString("username", saved_username);
        editor.putString("password", saved_pass);
        editor.apply();
        Toast.makeText(this, "Username dan Password anda telah di Update", Toast.LENGTH_LONG).show();
        Intent goToReLogin = new Intent(this, LoginActivity.class);
        startActivity(goToReLogin);
    }
}
