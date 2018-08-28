package com.example.quicsolv.testlibraryapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.quicsolv.testkishorglibrary.CustomClassTestKishor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindview();
    }

    private void bindview() {
        String addition = String.valueOf(CustomClassTestKishor.Add(10, 20));
        String minus = String.valueOf(CustomClassTestKishor.Minus(10, 20));
        String dic = String.valueOf(CustomClassTestKishor.Divisionnn(10, 20));

        Toast.makeText(this, "" + addition, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "" + minus, Toast.LENGTH_SHORT).show();
    }
}
