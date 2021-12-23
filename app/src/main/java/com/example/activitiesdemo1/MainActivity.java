package com.example.activitiesdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button SD,TD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SD = findViewById(R.id.SA);
        TD = findViewById(R.id.TA);

        SD.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), "Moving to Second Activity - Exiting the First Activity - Thank you", Toast.LENGTH_LONG);
            toast.show();
            Intent i = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(i);
        });

        TD.setOnClickListener(view -> {
            Toast toast = Toast.makeText(getApplicationContext(), "Moving to Third Activity - Exiting the First Activity - Thank you", Toast.LENGTH_LONG);
            toast.show();
            Intent j = new Intent(MainActivity.this,ThirdActivity.class);
            startActivity(j);
        });
    }
}