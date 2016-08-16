package com.example.hwhong.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by hwhong on 7/6/16.
 */
public class SecondActivity extends AppCompatActivity {
    TextView result;
    TextView todo;
    int extraInt = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        result = (TextView)findViewById(R.id.result);
        todo = (TextView) findViewById(R.id.todo);

        //Intent intent = getIntent();

        Bundle bundle = getIntent().getExtras();

        int weight = Integer.parseInt(bundle.getString("USER_WEIGHT_EXTRA"));
        int height = Integer.parseInt(bundle.getString("USER_HEIGHT_EXTRA"));

        /*
        int weight = intent.getIntExtra("USER_WEIGHT_EXTRA", extraInt);
        int height = intent.getIntExtra("USER_HEIGHT_EXTRA", extraInt);
        */

        double height2 = (double)height/100;
        double BMI = (weight*1.0)/(height2*height2);


        if (BMI < 20.0) {
            result.setText("You are: UNDERWEIGHT");
            todo.setText("You Should EAT MORE");
        } else if (BMI > 20.0 && BMI < 25.0) {
            result.setText("You are: NORMAL WEIGHT");
            todo.setText("You Should keep STAYING HEALTHY");
        } else if (BMI > 25) {
            result.setText("You are: OVERWEIGHT");
            todo.setText("You Should EXERCISE MORE");
        }
    }

}
