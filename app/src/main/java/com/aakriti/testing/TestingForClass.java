package com.aakriti.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TestingForClass extends AppCompatActivity {
    EditText etFirstno, etSecondno;
    Button btnsum, btnsub, btndivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing_for_class);

        etFirstno = findViewById(R.id.etFirstno);
        etSecondno = findViewById(R.id.etSecondno);
        btnsum = findViewById(R.id.btnSum);
        btnsub = findViewById(R.id.btnSub);
        btndivide = findViewById(R.id.btnDivide);


        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Add();
            }
        });
    }

    private void Add() {
        float first = Float.parseFloat((etFirstno.getText().toString()));
        float second = Float.parseFloat((etSecondno.getText().toString()));

        Arithmetic arithmetic = new Arithmetic();

        float result = arithmetic.add(first,second);

        Intent intent = new Intent(TestingForClass.this, ResultActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}
