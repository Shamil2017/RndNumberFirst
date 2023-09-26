package com.example.rndnumberfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvNumber;
    Button btnRandNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvNumber = findViewById(R.id.tvNumber);
        btnRandNumber = findViewById(R.id.btnRandNumber);
    }

    public void newNumber(View view) {
        int num = 1 + (int)((9-1+1)*Math.random());
        tvNumber.setText("Случайное число "+num);
    }
}