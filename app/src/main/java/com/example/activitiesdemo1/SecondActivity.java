package com.example.activitiesdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Button FA,TA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        FA = (Button) findViewById(R.id.SSFA1);
        TA = (Button) findViewById(R.id.SSTA);

        FA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Moving to First Activity - Exiting the Second Activity - Thank you", Toast.LENGTH_LONG);
                toast.show();
                Intent i = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        TA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Moving to Third Activity - Exiting the Second Activity - Thank you", Toast.LENGTH_LONG);
                toast.show();
                Intent j = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(j);
            }
        });


    }
}