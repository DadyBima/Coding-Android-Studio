package com.dadybima.a5activity;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Persegi(View view) {
        Log.d(LOG_TAG, "Memilih Persegi Panjang");
        Intent persegiPanjang = new Intent(this, Persegi.class);
        startActivity(persegiPanjang);
    }
    public void Segitiga(View view) {
        Intent segitiga = new Intent(this, Segitiga.class);
        startActivity(segitiga);
    }

    public void Lingkaran(View view) {
        Intent lingkaran = new Intent(this, Lingkaran.class);
        startActivity(lingkaran);
    }
    public void Kubus(View view) {
        Intent kubus = new Intent(this, Kubus.class);
        startActivity(kubus);
    }
}