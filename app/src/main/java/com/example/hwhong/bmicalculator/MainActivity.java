package com.example.hwhong.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    static final String USER_WEIGHT_EXTRA = "USER_WEIGHT_DATA";
    static final String USER_HEIGHT_EXTRA = "USER_HEIGHT_DATA";

    EditText weightText;
    EditText heightText;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weightText = (EditText) findViewById(R.id.weightEdit);
        heightText = (EditText) findViewById(R.id.heightEdit);
        calculate = (Button) findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(getApplicationContext(), SecondActivity.class);
                in.putExtra("USER_WEIGHT_EXTRA", weightText.getText().toString());
                in.putExtra("USER_HEIGHT_EXTRA", heightText.getText().toString());
                startActivity(in);

                /*
                int weight = Integer.parseInt(weightText.getText().toString());
                int height = Integer.parseInt(heightText.getText().toString());

                intent.putExtra(USER_WEIGHT_EXTRA, weight);
                intent.putExtra(USER_HEIGHT_EXTRA, height);
                startActivity(intent);
                */
            }
        });
    }
}
