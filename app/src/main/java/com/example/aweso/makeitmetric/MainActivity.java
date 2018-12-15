package com.example.aweso.makeitmetric;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTitleMessage;

    private Spinner inputSpinner;
    private Spinner outputSpinner;

    private EditText inputText;
    private TextView outputText;

    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button num0;
    private Button numDelete;
    private Button numCovert;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_weight:
                    mTitleMessage.setText(R.string.title_weight);
                    return true;
                case R.id.navigation_length:
                    mTitleMessage.setText(R.string.title_weight);
                    return true;
                case R.id.navigation_volume:
                    mTitleMessage.setText(R.string.title_volume);
                    return true;
                case R.id.navigation_temperature:
                    mTitleMessage.setText(R.string.title_temperature);
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTitleMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        inputSpinner = (Spinner) findViewById(R.id.spinner_input_unit);
        outputSpinner = (Spinner) findViewById(R.id.spinner_output_unit);

        inputText = (EditText) findViewById(R.id.text_input);
        outputText = (TextView) findViewById(R.id.text_output);

        //TODO try refactor to arrayAdapter with single OnClickListener
        num1 = (Button) findViewById(R.id.num_1);
        num2 = (Button) findViewById(R.id.num_2);
        num3 = (Button) findViewById(R.id.num_3);
        num4 = (Button) findViewById(R.id.num_4);
        num5 = (Button) findViewById(R.id.num_5);
        num6 = (Button) findViewById(R.id.num_6);
        num7 = (Button) findViewById(R.id.num_7);
        num8 = (Button) findViewById(R.id.num_8);
        num9 = (Button) findViewById(R.id.num_9);
        num0 = (Button) findViewById(R.id.num_0);
        numDelete = (Button) findViewById(R.id.num_delete);
        numCovert = (Button) findViewById(R.id.num_convert);

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "1"));
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "2"));
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "3"));
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "4"));
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "5"));
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "6"));
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "7"));
            }
        });
        
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "8"));
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "9"));
            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "0"));
            }
        });

        numDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO delete last input
                //inputText.setText(inputText.getText().insert(inputText.getText().length(), "1"));
            }
        });

        numCovert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO convert inputs
                //inputText.setText(inputText.getText().insert(inputText.getText().length(), "1"));
            }
        });
    }

}
