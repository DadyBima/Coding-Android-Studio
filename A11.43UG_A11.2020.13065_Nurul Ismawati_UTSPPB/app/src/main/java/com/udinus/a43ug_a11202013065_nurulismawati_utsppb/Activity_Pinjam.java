package com.udinus.a43ug_a11202013065_nurulismawati_utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_Pinjam extends AppCompatActivity {
    EditText editpersonName;
    EditText editLongMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinjam);

        editpersonName = findViewById(R.id.isi_nama);
        editLongMessage = findViewById(R.id.isi_alamat);
    }

    public void ClickPinjam (View view){
        // Validasi input nama dan alamat kosong
        if(TextUtils.isEmpty(editpersonName.getText().toString().trim())
                &&
                TextUtils.isEmpty(editLongMessage.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Nama dan Alamat Tidak Boleh Kosong",Toast.LENGTH_LONG).show();
        }
        // Validasi input nama kosong
        if(TextUtils.isEmpty(editpersonName.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Isikan nama Anda", Toast.LENGTH_LONG).show();
        }
        // Validasi input alamat kosong
        else if (TextUtils.isEmpty(editLongMessage.getText().toString())){
            Toast.makeText(view.getContext(), "Isikan alamat Anda", Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(Activity_Pinjam.this, Sukses_Activity.class);
            startActivity(i);
        }
    }
}