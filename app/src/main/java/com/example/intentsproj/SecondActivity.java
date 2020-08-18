package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView resultText;
    EditText received_Edit_Text_Number1,received_Edit_Text_Number2;
    Button Add_button,Sub_button,Multy_button,Divide_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        resultText = (TextView)findViewById(R.id.calculated_value);
        received_Edit_Text_Number1 = (EditText)findViewById(R.id.numOneText);
        received_Edit_Text_Number2 = (EditText)findViewById(R.id.numTwoText);
        Add_button = (Button)findViewById(R.id.AddBtn);
        Multy_button = (Button)findViewById(R.id.MultiBtn);
        Sub_button = (Button)findViewById(R.id.subsBtn);
        Divide_button = (Button)findViewById(R.id.divideBtn);

        // create the get Intent object
        Intent intent = getIntent();

        // receive the value by getStringExtra() method
        // and key must be same which is send by first activity
        String str1 = intent.getStringExtra("message_key1");
        String str2 = intent.getStringExtra("message_key2");

        // display the string into EditText
        received_Edit_Text_Number1.setText(str1);
        received_Edit_Text_Number2.setText(str2);


        // Add_button add clicklistener
        Add_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(received_Edit_Text_Number1.getText().toString());
                double num2 = Double.parseDouble(received_Edit_Text_Number2.getText().toString());
                // add both number and store it to sum
                double sum = num1 + num2;
                // set it ot result textview
                resultText.setText(num1 + " + " + num2 +" = " + Double.toString(sum));
            }
        });


        // Sub_button add clicklistener
        Sub_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(received_Edit_Text_Number1.getText().toString());
                double num2 = Double.parseDouble(received_Edit_Text_Number2.getText().toString());
                // add both number and store it to sum
                double substraction = num1 - num2;
                // set it ot result textview
                resultText.setText(num1 + " - " + num2 +" = " + Double.toString(substraction));
            }
        });


        // Add_button add clicklistener
        Multy_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(received_Edit_Text_Number1.getText().toString());
                double num2 = Double.parseDouble(received_Edit_Text_Number2.getText().toString());
                // add both number and store it to sum
                double multiply = num1 * num2;
                // set it ot result textview
                resultText.setText(num1 + " * " + num2 +" = " + Double.toString(multiply));
            }
        });

        // Divide_button add clicklistener
        Divide_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(received_Edit_Text_Number1.getText().toString());
                double num2 = Double.parseDouble(received_Edit_Text_Number2.getText().toString());
                // add both number and store it to sum
                double division = num1 / num2;
                // set it ot result textview
                resultText.setText(num1 + " / " + num2 +" = " + Double.toString(division));
            }
        });

    }
}