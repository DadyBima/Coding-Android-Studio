package com.dadybima.a5activity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class Kubus extends AppCompatActivity {
    private EditText rusuk;
    private TextView luasKubus;
    private TextView KelilingKubus;
    private TextView volumeKubus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kubus);
        rusuk = (EditText) findViewById(R.id.rusuk);
        KelilingKubus = (TextView) findViewById(R.id.TVKelilingKubus);
        luasKubus = (TextView)
                findViewById(R.id.TVLuasKubus);
        volumeKubus = (TextView) findViewById(R.id.TVVolumeKubus);
    }
    public void LuasPermukaanKubus(View view) {
        int s = Integer.parseInt(rusuk.getText().toString());
        int luas = 6 * (s * s);
        luasKubus.setText(String.valueOf(luas));
    }
    public void KelilingKubus(View view) {
        int s = Integer.parseInt(rusuk.getText().toString());
        int keliling = 12 * s;
        KelilingKubus.setText(String.valueOf(keliling));
    }

    public void VolumeKubus(View view) {
        int s = Integer.parseInt(rusuk.getText().toString());
        int volume = s * s * s;
        volumeKubus.setText(String.valueOf(volume));
    }
}