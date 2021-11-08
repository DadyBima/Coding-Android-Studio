package com.dadybima.projectnilaiku;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

    public class MainActivity extends AppCompatActivity {
        private EditText edTgs,edUts,edUas,edHuruf,edAkhir,edPredikat,edPTgs,edPUts,edPUas;
        private float Tgs,PTgs,Uts,PUts,Uas,PUas,nAkhir;
        private String huruf,predikat;

        public MainActivity() {
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            edTgs = (EditText) findViewById(R.id.ETnTugas);
            edUts = (EditText) findViewById(R.id.ETnUts);
            edUas = (EditText) findViewById(R.id.ETnUas);
            edPTgs= (EditText) findViewById(R.id.NaTugas);
            edPUts= (EditText) findViewById(R.id.NaUts);
            edPUas= (EditText) findViewById(R.id.NaUas);
            edAkhir= (EditText) findViewById(R.id.etnakhir);
            edHuruf= (EditText) findViewById(R.id.ETnHuruf);

            edPredikat= (EditText) findViewById(R.id.ETpredikat);
            edTgs.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int
                        count, int after) {
                }
                @Override
                public void onTextChanged(CharSequence s, int start, int
                        before, int count) {
                }
                @Override
                public void afterTextChanged(Editable s) {
                    if(edTgs.getText().toString().isEmpty())
                    {
                        Tgs=0;
                    }
                    else {
                        Tgs =
                                Float.parseFloat(edTgs.getText().toString());
                    }
                    PTgs=0.3f*Tgs;
                    edPTgs.setText(Float.toString(PTgs));
                }
            });
            edUts.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i,
                                              int i1, int i2) {
                }
                @Override
                public void onTextChanged(CharSequence charSequence, int i, int
                        i1, int i2) {
                }
                @Override
                public void afterTextChanged(Editable editable) {
                    if (edUts.getText().toString().isEmpty())
                    {
                        Uts=0;
                    }
                    else {
                        Uts = Float.parseFloat(edUts.getText().toString());
                    }
                    PUts= (float) (0.35*Uts);
                    edPUts.setText(Float.toString(PUts));
                }
            });
            edUas.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i,
                                              int i1, int i2) {
                }
                @Override
                public void onTextChanged(CharSequence charSequence, int i, int
                        i1, int i2) {

                }
                @Override
                public void afterTextChanged(Editable editable) {
                    if(edUas.getText().toString().isEmpty())
                    {
                        Uas=0;
                    }else {
                        Uas = Float.parseFloat(edUas.getText().toString());
                    }
                    PUas= (float) (0.35*Uas);
                    edPUas.setText(Float.toString(PUas));
                }
            });
        }
        private void hitungAkhir() {
            nAkhir = PTgs+PUts+PUas;
        }
        public void hitung(View view) {
            hitungAkhir();
            edAkhir.setText(Float.toString(nAkhir));
            edHuruf.setText(getHuruf(nAkhir));
            edPredikat.setText(getPredikat(huruf));
        }
        public String getHuruf(float nilai)
        {
            if(nilai>=85)
                huruf="A";
            else if(nilai>=80)
                huruf="AB";
            else if(nilai>=70)
                huruf="B";
            else if(nilai>=65)
                huruf="BC";
            else if(nilai>=60)
                huruf="C";
            else if(nilai>=50)
                huruf="D";
            else
                huruf="E";
            return huruf;
        }
        public String getPredikat(String nHuruf)
        {
            String predikat;
            switch(nHuruf)
            {
                case "A":
                    predikat ="Apik";break;
                case "AB":
                    predikat ="Apik Baik";break;
                case "B":
                    predikat ="Baik";break;
                case "BC":
                    predikat ="Cukup Baik";break;
                case "C":
                    predikat ="Cukup";break;
                case "D":
                    predikat ="Dablef";break;
                default:
                    predikat ="Elek";
            }
            return predikat;

        }
        public void exit(View view) {
            finish();
            System.exit(0);
        }
    }