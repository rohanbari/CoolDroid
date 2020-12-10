package com.rohanbari.cooldroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Circle circle = new Circle();
        circle.setRadius(10.00f);

        float area = circle.getArea();

        Toast.makeText(this, "The circle area is: " + area, Toast.LENGTH_SHORT).show();
    }
}