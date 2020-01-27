package com.aakriti.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = findViewById(R.id.tvResult);

        Bundle extras = getIntent().getExtras();
        if (!extras.isEmpty()){
            float str= extras.getFloat("result");
            result.setText(Float.toString(str));
        }
        else {
            Toast.makeText(this, "No data", Toast.LENGTH_SHORT).show();
        }
    }
}
