package com.dadybima.a5activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class Persegi extends AppCompatActivity {
    private EditText sisi;
    private TextView hasilLuasPersegi;
    private TextView hasilKelilingPersegi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi);
        sisi = (EditText) findViewById(R.id.sisi);
        hasilKelilingPersegi = (TextView)
                findViewById(R.id.KelilingPersegi);
        hasilLuasPersegi = (TextView) findViewById(R.id.LuasPersegi);
    }
    public void LuasPersegi(View view) {
        int s = Integer.parseInt(sisi.getText().toString());
        int luas = s * s;
        hasilLuasPersegi.setText(String.valueOf(luas));
    }
    public void KelilingPersegi(View view) {
        int s = Integer.parseInt(sisi.getText().toString());
        int keliling = 4 * s;
        hasilKelilingPersegi.setText(String.valueOf(keliling));
    }
}