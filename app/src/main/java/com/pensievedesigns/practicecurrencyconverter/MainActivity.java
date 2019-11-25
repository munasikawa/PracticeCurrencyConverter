package com.pensievedesigns.practicecurrencyconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Using Constants, converting Strings to double through Parsing

    public static final double STERLING_POUND_RATE = 131.13;
    
    public void convertBtnClicked(View view){

        EditText currencyEditText = findViewById(R.id.currencyEditText);
        String stringValue = currencyEditText.getText().toString();
        double originalValue = Double.parseDouble(stringValue);
        double newValue = originalValue * STERLING_POUND_RATE;


        Toast.makeText(this, "The amount is KSH. " + newValue , Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
