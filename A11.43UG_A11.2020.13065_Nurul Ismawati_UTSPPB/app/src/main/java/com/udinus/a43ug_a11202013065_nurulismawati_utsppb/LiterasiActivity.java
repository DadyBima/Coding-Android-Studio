package com.udinus.a43ug_a11202013065_nurulismawati_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LiterasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literasi);
    }

    public void clickLogin (View view){
        Intent i = new Intent(LiterasiActivity.this, WelcomeBackActivity.class);
        startActivity(i);
    }
}