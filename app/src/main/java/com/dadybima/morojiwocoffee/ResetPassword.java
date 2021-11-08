package com.dadybima.morojiwocoffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ResetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reset_password);
    }
    public void ChangePassword(View view) {
        Intent changePass = new Intent(this, LoginActivity.class);
        startActivity(changePass);
    }
}
