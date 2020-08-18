package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button sendBtn;
    EditText textNumberOne,textNumberTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        sendBtn = (Button)findViewById(R.id.AppOkBtn);
        textNumberOne = (EditText)findViewById(R.id.numberOneEditText);
        textNumberTwo = (EditText)findViewById(R.id.numberTwoEditText);

        // add the OnClickListener in sender button
        // after clicked this button following Instruction will run
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {


//                Toast.makeText(getApplicationContext(),
//                        "You just clicked the OK button", Toast.LENGTH_SHORT).show();

                //Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();
                //Getting the View object as defined in the customtoast.xml file
                View layout = li.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.custom_toast_layout));
                //Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setView(layout);//setting the view of custom toast layout
                toast.show();

                // get the value which input by user in EditText
                // and convert it to string
                String str1 = textNumberOne.getText().toString();
                String str2 = textNumberTwo.getText().toString();

                // Create the Intent object of this class Context() to SecondActivity class
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                // now by putExtra method put the value in key, value pair
                // key is message_key by this key we will receive the value, and put the string

                intent.putExtra("message_key1", str1);
                intent.putExtra("message_key2", str2);

                // start the Intent
                startActivity(intent);
            }
        });


    }
}