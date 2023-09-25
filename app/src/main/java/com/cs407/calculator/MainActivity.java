package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFunction(View view) {
        EditText firstInt = (EditText) findViewById(R.id.myTextField);
        EditText secondInt = (EditText) findViewById(R.id.myTextField2);
        goToActivity(String.valueOf((Integer.parseInt(firstInt.getText().toString()) + Integer.parseInt(secondInt.getText().toString()))));
    }

    public void multiplyFunction(View view) {
        EditText firstInt = (EditText) findViewById(R.id.myTextField);
        EditText secondInt = (EditText) findViewById(R.id.myTextField2);
        goToActivity(String.valueOf((Integer.parseInt(firstInt.getText().toString()) * Integer.parseInt(secondInt.getText().toString()))));
    }

    public void subtractFunction(View view) {
        EditText firstInt = (EditText) findViewById(R.id.myTextField);
        EditText secondInt = (EditText) findViewById(R.id.myTextField2);
        goToActivity(String.valueOf((Integer.parseInt(firstInt.getText().toString()) - Integer.parseInt(secondInt.getText().toString()))));
    }

    public void divideFunction(View view) {
        EditText firstInt = (EditText) findViewById(R.id.myTextField);
        EditText secondInt = (EditText) findViewById(R.id.myTextField2);

        if(Integer.parseInt(secondInt.getText().toString()) == 0) {
            goToActivity("ERROR! Cannot divide by 0.");
        } else {
            goToActivity(String.valueOf((Integer.parseInt(firstInt.getText().toString()) / Integer.parseInt(secondInt.getText().toString()))));
        }
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, Display.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}