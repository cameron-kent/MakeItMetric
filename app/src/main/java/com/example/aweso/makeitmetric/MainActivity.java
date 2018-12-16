package com.example.aweso.makeitmetric;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Context activityContext = (Context) this;
    private TextView mTitleMessage;

    private Spinner inputSpinner;
    private Spinner outputSpinner;
    private ArrayAdapter<CharSequence> inputAdapter, outputAdapter;

    private EditText inputText;
    private TextView outputText;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            GridLayout numPad = (GridLayout) findViewById(R.id.numpad);

            switch (item.getItemId()) {
                case R.id.navigation_weight:
                    numPad.setVisibility(View.VISIBLE);

                    PopulateSpinners(R.array.array_weight_input, R.array.array_weight_output);
//                    inputAdapter = ArrayAdapter.createFromResource(activityContext, R.array.array_weight_input, android.R.layout.simple_spinner_item);
//                    inputAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    inputSpinner.setAdapter(inputAdapter);
//
//                    outputAdapter = ArrayAdapter.createFromResource(activityContext, R.array.array_weight_output, android.R.layout.simple_spinner_item);
//                    outputAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    outputSpinner.setAdapter(outputAdapter);

                    mTitleMessage.setText(R.string.title_weight);

                    clearInputField();
                    return true;
                case R.id.navigation_length:
                    numPad.setVisibility(View.VISIBLE);

                    PopulateSpinners(R.array.array_length_input, R.array.array_length_output);

//                    inputAdapter = ArrayAdapter.createFromResource(activityContext, R.array.array_length_input, android.R.layout.simple_spinner_item);
//                    inputAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    inputSpinner.setAdapter(inputAdapter);
//
//                    outputAdapter = ArrayAdapter.createFromResource(activityContext, R.array.array_length_output, android.R.layout.simple_spinner_item);
//                    outputAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    outputSpinner.setAdapter(outputAdapter);

                    mTitleMessage.setText(R.string.title_length);
                    return true;
                case R.id.navigation_volume:
                    numPad.setVisibility(View.VISIBLE);

                    PopulateSpinners(R.array.array_volume_input, R.array.array_volume_output);

//                    inputAdapter = ArrayAdapter.createFromResource(activityContext, R.array.array_volume_input, android.R.layout.simple_spinner_item);
//                    inputAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    inputSpinner.setAdapter(inputAdapter);
//
//                    outputAdapter = ArrayAdapter.createFromResource(activityContext, R.array.array_volume_output, android.R.layout.simple_spinner_item);
//                    outputAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    outputSpinner.setAdapter(outputAdapter);

                    mTitleMessage.setText(R.string.title_volume);
                    return true;
                case R.id.navigation_temperature:
                    numPad.setVisibility(View.VISIBLE);

                    PopulateSpinners(R.array.array_temperature_input, R.array.array_temperature_output);

//                    inputAdapter = ArrayAdapter.createFromResource(activityContext, R.array.array_temperature_input, android.R.layout.simple_spinner_item);
//                    inputAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    inputSpinner.setAdapter(inputAdapter);
//
//                    outputAdapter = ArrayAdapter.createFromResource(activityContext, R.array.array_temperature_output, android.R.layout.simple_spinner_item);
//                    outputAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//                    outputSpinner.setAdapter(outputAdapter);

                    mTitleMessage.setText(R.string.title_temperature);
                    return true;
            }
            return false;
        }
    };

    private void PopulateSpinners(int array_input, int array_output) {
        inputAdapter = ArrayAdapter.createFromResource(activityContext, array_input, android.R.layout.simple_spinner_item);
        inputAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        inputSpinner.setAdapter(inputAdapter);

        outputAdapter = ArrayAdapter.createFromResource(activityContext, array_output, android.R.layout.simple_spinner_item);
        outputAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        outputSpinner.setAdapter(outputAdapter);
    }

    private void clearInputField() {
        //TODO set clear method on update
    }


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
        inputText.setOnTouchListener(inputTouchListener);


        outputText = (TextView) findViewById(R.id.text_output);

        Button num1 = (Button) findViewById(R.id.num_1);
        num1.setOnClickListener(this);
        Button num2 = (Button) findViewById(R.id.num_2);
        num2.setOnClickListener(this);
        Button num3 = (Button) findViewById(R.id.num_3);
        num3.setOnClickListener(this);
        Button num4 = (Button) findViewById(R.id.num_4);
        num4.setOnClickListener(this);
        Button num5 = (Button) findViewById(R.id.num_5);
        num5.setOnClickListener(this);
        Button num6 = (Button) findViewById(R.id.num_6);
        num6.setOnClickListener(this);
        Button num7 = (Button) findViewById(R.id.num_7);
        num7.setOnClickListener(this);
        Button num8 = (Button) findViewById(R.id.num_8);
        num8.setOnClickListener(this);
        Button num9 = (Button) findViewById(R.id.num_9);
        num9.setOnClickListener(this);
        Button num0 = (Button) findViewById(R.id.num_0);
        num0.setOnClickListener(this);
        Button numDecimal = (Button) findViewById(R.id.num_decimal);
        numDecimal.setOnClickListener(this);
        Button numDelete = (Button) findViewById(R.id.num_delete);
        numDelete.setOnClickListener(this);
        Button numCovert = (Button) findViewById(R.id.num_convert);
        numCovert.setOnClickListener(this);


    }

    private View.OnTouchListener inputTouchListener = new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {
            return true; // the listener has consumed the event
        }
    };

    @Override
    public void onClick(View button) {

        switch (button.getId()) {
            case R.id.num_1:
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "1"));
                break;
            case R.id.num_2:
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "2"));
                break;
            case R.id.num_3:
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "3"));
                break;
            case R.id.num_4:
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "4"));
                break;
            case R.id.num_5:
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "5"));
                break;
            case R.id.num_6:
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "6"));
                break;
            case R.id.num_7:
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "7"));
                break;
            case R.id.num_8:
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "8"));
                break;
            case R.id.num_9:
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "9"));
                break;
            case R.id.num_0:
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "0"));
                break;
            case R.id.num_decimal:
                inputText.setText(inputText.getText().insert(inputText.getText().length(), "."));
                break;
            case R.id.num_delete:
                if (inputText.length() > 0) {
                    inputText.setText(inputText.getText().subSequence(0, inputText.length() - 1));
                }
                break;
            case R.id.num_convert:
                convertToMetric();
                break;
        }
    }

    private void convertToMetric() {
        //TODO convert inputs
    }
}
