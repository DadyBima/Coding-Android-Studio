package com.dadybima.morojiwocoffee;


import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Dashboard extends AppCompatActivity {
    public TextView list1, list2, list3, list4, list5, list6, list7, list8;
    private int total = 0;
    private int hargaAkhir;
    private int item1, item2, item3, item4, item5, item6, item7, item8;
    private TextView totalHarga;
    private SharedPreferences totalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        list1 = findViewById(R.id.menu1);
        list2 = findViewById(R.id.menu2);
        list3 = findViewById(R.id.menu3);
        list4 = findViewById(R.id.menu4);
        list5 = findViewById(R.id.menu5);
        list6 = findViewById(R.id.menu6);
        list7 = findViewById(R.id.menu7);
        list8 = findViewById(R.id.menu8);
        totalHarga = (TextView) findViewById(R.id.totalharga);
        totalList = getSharedPreferences("checkout", MODE_PRIVATE);
    }

    public void load() {
        String stotal = totalList.getString("total", "");
        totalHarga.setText(stotal);
    }

    public void tambahList1(View view) {
        item1 = 24000;
        int totalc = Integer.parseInt(totalHarga.getText().toString());
        hargaAkhir = totalc + item1;
        totalHarga.setText(String.valueOf(hargaAkhir));
        String total1 = totalHarga.getText().toString();

        SharedPreferences.Editor editor = totalList.edit();
        editor.putString("total", total1);
        editor.apply();
    }

    public void tambahList2(View view) {
        item2 = 24000;
        int totalc = Integer.parseInt(totalHarga.getText().toString());
        hargaAkhir = totalc + item2;
        totalHarga.setText(String.valueOf(hargaAkhir));
        String total1 = totalHarga.getText().toString();

        SharedPreferences.Editor editor = totalList.edit();
        editor.putString("total", total1);
        editor.apply();
    }

    public void tambahList3(View view) {
        item3 = 28000;
        int totalc = Integer.parseInt(totalHarga.getText().toString());
        hargaAkhir = totalc + item3;
        totalHarga.setText(String.valueOf(hargaAkhir));
        String total1 = totalHarga.getText().toString();

        SharedPreferences.Editor editor = totalList.edit();
        editor.putString("total", total1);
        editor.apply();
    }

    public void tambahList4(View view) {
        item4 = 12000;
        int totalc = Integer.parseInt(totalHarga.getText().toString());
        hargaAkhir = totalc + item4;
        totalHarga.setText(String.valueOf(hargaAkhir));
        String total1 = totalHarga.getText().toString();

        SharedPreferences.Editor editor = totalList.edit();
        editor.putString("total", total1);
        editor.apply();
    }

    public void tambahList5(View view) {
        item5 = 12000;
        int totalc = Integer.parseInt(totalHarga.getText().toString());
        hargaAkhir = totalc + item5;
        totalHarga.setText(String.valueOf(hargaAkhir));
        String total1 = totalHarga.getText().toString();

        SharedPreferences.Editor editor = totalList.edit();
        editor.putString("total", total1);
        editor.apply();
    }

    public void tambahList6(View view) {
        item6 = 12000;
        int totalc = Integer.parseInt(totalHarga.getText().toString());
        hargaAkhir = totalc + item6;
        totalHarga.setText(String.valueOf(hargaAkhir));
        String total1 = totalHarga.getText().toString();

        SharedPreferences.Editor editor = totalList.edit();
        editor.putString("total", total1);
        editor.apply();
    }

    public void tambahList7(View view) {
        item7 = 80000;
        int totalc = Integer.parseInt(totalHarga.getText().toString());
        hargaAkhir = totalc + item7;
        totalHarga.setText(String.valueOf(hargaAkhir));
        String total1 = totalHarga.getText().toString();

        SharedPreferences.Editor editor = totalList.edit();
        editor.putString("total", total1);
        editor.apply();
    }

    public void tambahList8(View view) {
        item8 = 43000;
        int totalc = Integer.parseInt(totalHarga.getText().toString());
        hargaAkhir = totalc + item8;
        totalHarga.setText(String.valueOf(hargaAkhir));
        String total1 = totalHarga.getText().toString();

        SharedPreferences.Editor editor = totalList.edit();
        editor.putString("total", total1);
        editor.apply();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.UpdateUserPass:
                Intent goToUpdatePass = new Intent(this, UpdateUserPass.class);
                startActivity(goToUpdatePass);
                return true;
            case R.id.CallCenter:
                Uri number = Uri.parse("tel:08123456789");
                Intent dial = new Intent(Intent.ACTION_DIAL, number);
                startActivity(dial);
                return true;
            case R.id.SmsCenter:
                Uri sms = Uri.parse("smsto:085898716589");
                Intent message = new Intent(Intent.ACTION_SENDTO, sms);
                message.putExtra("sms_body", "Silahkan beri tanggapannya :");
                startActivity(message);
                return true;
            case R.id.LokasiMaps:
                Uri maps = Uri.parse("https://www.google.com/maps/place/Universitas+Dian+Nuswantoro/@-6.9828663,110.4090967,17z/data=!4m5!3m4!1s0x2e708b4ec52229d7:0xc791d6abc9236c7!8m2!3d-6.9828663!4d110.4090967");
                Intent location = new Intent(Intent.ACTION_VIEW, maps);
                startActivity(location);
                return true;
            default:
        }
        return super.onOptionsItemSelected(item);
    }

    public void CheckOut(View view) {
        Intent CheckOut = new Intent(this, CheckOutActivity.class);
        startActivity(CheckOut);
    }

    public void GoToProduct1(View view) {
        Intent goToArabicaNatural = new Intent(this, ArabicaNatural.class);
        startActivity(goToArabicaNatural);
    }

    public void GoToProduct2(View view) {
        Intent goToArabicaAnaerob = new Intent(this, ArabicaAnaerob.class);
        startActivity(goToArabicaAnaerob);
    }

    public void GoToProduct3(View view) {
        Intent goToArabicaWine = new Intent(this, ArabicaWine.class);
        startActivity(goToArabicaWine);
    }

    public void GoToProduct4(View view) {
        Intent goToRobustaNatural = new Intent(this, RobustaNatural.class);
        startActivity(goToRobustaNatural);
    }

    public void GoToProduct5(View view) {
        Intent goToRobustaHoney = new Intent(this, RobustaHoney.class);
        startActivity(goToRobustaHoney);
    }

    public void GoToProduct6(View view) {
        Intent goToRobustaFullwash = new Intent(this, RobustaFullwash.class);
        startActivity(goToRobustaFullwash);
    }
    public void GoToProduct7(View view) {
        Intent goToDoubleProduct = new Intent(this, DoubleProduct.class);
        startActivity(goToDoubleProduct);
    }
    public void GoToProduct8(View view) {
        Intent goToPeaberryArabicaRobusta = new Intent(this, PeaberryArabicaRobusta.class);
        startActivity(goToPeaberryArabicaRobusta);
    }
}