package com.udinus.a43ug_a11202013065_nurulismawati_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuksesResetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukses_reset_password);
    }

    public void clickNext (View view){
        Intent i = new Intent(SuksesResetPassword.this, WelcomeBackActivity.class);
        startActivity(i);
    }
}