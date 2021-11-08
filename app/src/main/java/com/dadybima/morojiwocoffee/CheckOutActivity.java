package com.dadybima.morojiwocoffee;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CheckOutActivity extends AppCompatActivity {
    private EditText uangBayar;
    private TextView totalHarga, namaPembeli, tvKembalian, tvTotal;
    SharedPreferences totalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        namaPembeli = findViewById(R.id.NamaPembeli);
        uangBayar = findViewById(R.id.etBayar);
        tvKembalian = findViewById(R.id.tvKembalian);
        tvTotal = findViewById(R.id.tvTotal);
        totalHarga = (TextView) findViewById(R.id.totalharga);
        totalList = getSharedPreferences("checkout", MODE_PRIVATE);
        SharedPreferences pref = getSharedPreferences("login_key", MODE_PRIVATE);

        String stotal = totalList.getString("total", "");
        tvTotal.setText(stotal);

        String save_nama = pref.getString("namaLengkap", "");
        namaPembeli.setText(save_nama);
    }

    public void load() {
        String stotal = totalList.getString("total", "");
        totalHarga.setText(stotal);
    }


    public void Bayar (View view){
        String biaya = totalList.getString("total", "");
        Integer sBiaya = Integer.parseInt(biaya);
        Integer sBayar = Integer.parseInt(uangBayar.getText().toString());


        Integer kembalian = sBayar - sBiaya;
        String change = String.valueOf(kembalian);
        tvKembalian.setText(change);
    }
    public void GoBackToDashboard(View view){
        Intent gobackDash = new Intent(this, Dashboard.class);
        startActivity(gobackDash);
    }
}
