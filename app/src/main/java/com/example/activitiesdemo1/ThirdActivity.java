package com.example.activitiesdemo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    Button FA,SA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        FA = (Button) findViewById(R.id.TSFA1);
        SA = (Button) findViewById(R.id.TSSA);

        FA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Moving to First Activity - Exiting the Third Activity - Thank you", Toast.LENGTH_LONG);
                toast.show();
                Intent i = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

        SA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Moving to Second Activity - Exiting the Third Activity - Thank you", Toast.LENGTH_LONG);
                toast.show();
                Intent j = new Intent(ThirdActivity.this,SecondActivity.class);
                startActivity(j);
            }
        });
    }
}