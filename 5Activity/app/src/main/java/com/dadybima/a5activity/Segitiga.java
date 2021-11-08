package com.dadybima.a5activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class Segitiga extends AppCompatActivity {
    private EditText alas;
    private EditText tinggi;
    private TextView hasilLuasSegitiga;
    private TextView hasilKelilingSegitiga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);
        alas = (EditText) findViewById(R.id.alas);
        tinggi = (EditText) findViewById(R.id.tinggi);
        hasilKelilingSegitiga = (TextView)
                findViewById(R.id.TVKelilingSegitiga);
        hasilLuasSegitiga = (TextView) findViewById(R.id.TVLuasSegitiga);
    }
    public void LuasSegitiga(View view) {
        int a = Integer.parseInt(alas.getText().toString());
        int t = Integer.parseInt(tinggi.getText().toString());
        int luas = (a * t) / 2;
        hasilLuasSegitiga.setText(String.valueOf(luas));
    }
    public void KelilingSegitiga(View view) {
        int a = Integer.parseInt(alas.getText().toString());
        int t = Integer.parseInt(tinggi.getText().toString());
        int keliling = 3 * a ;
        hasilKelilingSegitiga.setText(String.valueOf(keliling));
    }
}