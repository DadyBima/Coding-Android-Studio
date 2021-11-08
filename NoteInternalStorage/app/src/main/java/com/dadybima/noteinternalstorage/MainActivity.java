package com.dadybima.noteinternalstorage;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String file_name = "notes.txt";
    String filepath = " ";
    String exfilename = "exNotes.txt";
    EditText editCatatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editCatatan = findViewById(R.id.edit_catatan);
        filepath = "FileDir";
    }
    public void save(View view) {
        String text = editCatatan.getText().toString();
        FileOutputStream fos = null;
        try {
            fos = openFileOutput(file_name, MODE_PRIVATE);
            fos.write(text.getBytes());
            editCatatan.getText().clear();
            Toast.makeText(this, "File saved to " + getFilesDir() + "/" +
                    file_name, Toast.LENGTH_LONG).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
    public void read(View view) {
        FileInputStream fis = null;
        try {
            fis = openFileInput(file_name);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuilder sb = new StringBuilder();
            String text;
            while ((text = br.readLine()) != null) {
                sb.append(text).append("\n");
            }
            editCatatan.setText(sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void save_sdcard(View view) {
        if (isExternalStorageAvailable() == true) {
            File myExternalFile = new File(getExternalFilesDir(filepath),
                    exfilename);
            String text = editCatatan.getText().toString();
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(myExternalFile);
                fos.write(text.getBytes());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            editCatatan.setText(" ");
            Toast.makeText(this, "Notes Saved to SD Card",
                    Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No SD Card Available",
                    Toast.LENGTH_SHORT).show();
        }
    }
    public void read_sdcard(View view) {
        if (isExternalStorageAvailable()) {
            FileReader fr = null;

            File myExternalFile = new File(getExternalFilesDir(filepath),
                    exfilename);
            StringBuilder sb = new StringBuilder();
            try {
                fr = new FileReader(myExternalFile);
                BufferedReader br = new BufferedReader(fr);
                String line = br.readLine();
                while (line != null) {
                    sb.append(line).append("\n");
                    line = br.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                String text = sb.toString();
                editCatatan.setText(text);
            }
        } else {
            Toast.makeText(this, "No SD Card Available",
                    Toast.LENGTH_SHORT).show();
        }
    }
    private boolean isExternalStorageAvailable() {
        String exStorageState = Environment.getExternalStorageState();
        if (exStorageState.equals(Environment.MEDIA_MOUNTED)) {
            return true;
        }
        return false;
    }
}