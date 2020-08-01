package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mButtonTrue;
    private Button mButtonFalse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonTrue = findViewById(R.id.btn_true);
        mButtonFalse = findViewById(R.id.btn_false);

        mButtonTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, R.string.toast_correct, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.getView().setBackgroundColor(Color.GREEN);
                TextView tv = toast.getView().findViewById(android.R.id.message);
                tv.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_baseline_check_box, 0, 0, 0);
                tv.setTextSize(32);
                //mButtonTrue.setTextColor(getResources().getColor(R.color.toast_correct));
                toast.show();


            }
        });

        mButtonFalse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this, R.string.toast_incorrect, Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0, 0);
                toast.getView().setBackgroundColor(Color.RED);
                TextView tv=toast.getView().findViewById(android.R.id.message);
                tv.setTextSize(32);
                //mButtonFalse.setTextColor(getResources().getColor(R.color.toast_incorrect));
                toast.show();

            }
        });
    }


}