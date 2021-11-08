package com.dadybima.penjualanayamku;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public TextView list1, list2, list3, list4, list5, list6;
    private int total = 0;
    private int hargaAkhir;
    private int item1, item2, item3, item4, item5, item6;
    private TextView totalHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list1 = findViewById(R.id.menu1);
        list2 = findViewById(R.id.menu2);
        list3 = findViewById(R.id.menu3);
        list4 = findViewById(R.id.menu4);
        list5 = findViewById(R.id.menu5);
        list6 = findViewById(R.id.menu6);
        totalHarga = (TextView) findViewById(R.id.totalharga);
    }
    public void tambahList1(View view) {
        item1 = Integer.parseInt(list1.getText().toString());
        hargaAkhir = total + item1;
        total = Integer.parseInt(String.valueOf(hargaAkhir));
        totalHarga.setText(String.valueOf(total));
    }
    public void tambahList2(View view) {
        item2 = Integer.parseInt(list2.getText().toString());
        hargaAkhir = total + item2;
        total = Integer.parseInt(String.valueOf(hargaAkhir));
        totalHarga.setText(String.valueOf(total));
    }
    public void tambahList3(View view) {
        item3 = Integer.parseInt(list3.getText().toString());
        hargaAkhir = total + item3;
        total = Integer.parseInt(String.valueOf(hargaAkhir));
        totalHarga.setText(String.valueOf(total));
    }
    public void tambahList4(View view) {
        item4 = Integer.parseInt(list4.getText().toString());
        hargaAkhir = total + item4;
        total = Integer.parseInt(String.valueOf(hargaAkhir));
        totalHarga.setText(String.valueOf(total));
    }
    public void tambahList5(View view) {
        item5 = Integer.parseInt(list5.getText().toString());
        hargaAkhir = total + item5;
        total = Integer.parseInt(String.valueOf(hargaAkhir));
        totalHarga.setText(String.valueOf(total));
    }
    public void tambahList6(View view) {
        item6 = Integer.parseInt(list6.getText().toString());
        hargaAkhir = total + item6;
        total = Integer.parseInt(String.valueOf(hargaAkhir));
        totalHarga.setText(String.valueOf(total));
    }
}