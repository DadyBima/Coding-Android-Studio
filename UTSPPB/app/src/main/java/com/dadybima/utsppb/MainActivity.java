package com.dadybima.utsppb;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etNamaPelanggan, etJmlUang;
    TextView tvNamaPembeli, tvUangBayar,
            tvTotal, tvKembalian, tvKeterangan;
    Button btnBayar, btnReset;

    String namaPelanggan, namaBarang, jumlahBarang, hargaBarang, uangBayar;
    double jmlBarang, hrgBarang, uangByr, total, kembalian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Aplikasi Penjualan");

        //EditText
        etNamaPelanggan = findViewById(R.id.etNamaPelanggan);
        etJmlUang = findViewById(R.id.etJmlUang);

        //TextView
        tvNamaPembeli = findViewById(R.id.tvNamaPembeli);
        tvUangBayar = findViewById(R.id.tvUangBayar);
        tvTotal = findViewById(R.id.tvTotal);
        tvKembalian = findViewById(R.id.tvKembalian);
        tvKeterangan = findViewById(R.id.tvKeterangan);

        //Button
        btnBayar = findViewById(R.id.btnProses);
        btnReset = findViewById(R.id.btnHapus);

        //Proses
        btnBayar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                namaPelanggan = etNamaPelanggan.getText().toString().trim();
                uangBayar = etJmlUang.getText().toString().trim();
                hrgBarang = Double.parseDouble(hargaBarang);
                uangByr = Double.parseDouble(uangBayar);
                total = (jmlBarang * hrgBarang);

                tvNamaPembeli.setText("Nama Pembeli : " + namaPelanggan);
                tvUangBayar.setText("Uang bayar : " + uangBayar);

                kembalian = (uangByr - total);
                if (uangByr < total) {
                    tvKeterangan.setText("Keterangan : Uang bayar kurang Rp. " + (-kembalian));
                    tvKembalian.setText("Uang Kembalian : Rp. 0");
                } else {
                    tvKeterangan.setText("Keterangan : Tunggu kembalian");
                    tvKembalian.setText("Uang Kembalian : Rp. " + kembalian);
                }

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvNamaPembeli.setText("");
                tvUangBayar.setText("");
                tvKembalian.setText("");
                tvKeterangan.setText("");
                tvTotal.setText("");

                Toast.makeText(getApplicationContext(), "Data sudah dihapus", Toast.LENGTH_SHORT).show();
            }
        });
    }
}