package com.example.sourabh.farhaneit_to_celsiusconvertor;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tempConvertor(View view){
        EditText text = (EditText)findViewById(R.id.text);

        RadioButton celsiusBtn = (RadioButton)findViewById(R.id.celsiusConvertor);
        RadioButton fahrenheitBtn = (RadioButton)findViewById(R.id.fahrenheitConvertor);
        if(text.getText().length() == 0){
            Toast.makeText(this,"Please Enter a Valid Number",Toast.LENGTH_LONG).show();
            return;
        }
        float inputText = Float.parseFloat(text.getText().toString());

        if(celsiusBtn.isChecked()) {
            text.setText(String.valueOf(convertCelsiusFromFahrenheit(inputText)));
            celsiusBtn.setChecked(false);
            fahrenheitBtn.setChecked(true);
        }
        else if(fahrenheitBtn.isChecked()){
            text.setText(String.valueOf(convertFahrenheitFromCelsius(inputText)));
            celsiusBtn.setChecked(true);
            fahrenheitBtn.setChecked(false);
        }
    }
    public float convertCelsiusFromFahrenheit(float value){
         return (value-32)*5/9;
    }
    public float convertFahrenheitFromCelsius(float value){
        return value*9/5 + 32;
    }
}
