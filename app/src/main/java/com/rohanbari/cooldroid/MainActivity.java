package com.rohanbari.cooldroid;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Circle circle;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.radiusRec);
        textView = findViewById(R.id.textView1);
        circle = new Circle();
    }

    /**
     * Obtains the value from the TextField and displays the area of the circle.
     * @param view View instance
     */
    public void calculate(View view) {
        String string = editText.getText().toString();

        circle.setRadius(Double.parseDouble(string));
        double area = circle.getArea();

        textView.setText(String.format(Locale.ENGLISH,
                "The circle area is: %s",
                String.format(Locale.ENGLISH, "%.2f", area)));
    }
}