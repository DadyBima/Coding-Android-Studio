package com.dadybima.a5activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class Lingkaran extends AppCompatActivity {
    private EditText jariJari;
    private TextView hasilKelilingLing;
    private TextView hasilLuasLing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lingkaran);
        jariJari = (EditText) findViewById(R.id.jarijari);
        hasilKelilingLing = (TextView)
                findViewById(R.id.TVKelilingLingkaran);
        hasilLuasLing = (TextView) findViewById(R.id.TVLuasLingkaran);
    }
    public void LuasLingkaran(View view) {
        double r = Double.parseDouble(jariJari.getText().toString());
        double luas = Math.PI * r * r ;
        hasilLuasLing.setText(String.valueOf(luas));
    }
    public void KelilingLingkaran(View view) {
        double r = Double.parseDouble(jariJari.getText().toString());
        double keliling = 2 * Math.PI * r ;
        hasilKelilingLing.setText(String.valueOf(keliling));
    }
}