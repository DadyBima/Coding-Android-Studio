package com.dadybima.droidcafe;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class OrderActivity extends AppCompatActivity {

    private static final String TAG_ACTIVITY =
            OrderActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.sameday:
                if (checked)
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.RG1));
                break;
            case R.id.nextday:
                if (checked)
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.RG2));
                break;
            case R.id.pickup:
                if (checked)
                    displayToast(getString(R.string.chosen) +
                            getString(R.string.RG3));
                break;
            default:
                Log.d(TAG_ACTIVITY, getString(R.string.chosen));
                break;
        }
    }
}
