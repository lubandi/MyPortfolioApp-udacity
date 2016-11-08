package com.umangarwal.myportfolioapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void ToastIt(View view) {

        Button button = (Button) view;

        String buttonText = button.getText().toString();


        Toast toast = Toast.makeText(getApplicationContext(),"This will launch the " + buttonText + " application from my portfolio",
                Toast.LENGTH_SHORT);

        toast.show();



    }
}
