package com.example.cynda.csc_201_1117;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView output;
    private Button button;
    private EditText inputET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView) findViewById(R.id.outputTV);
        button = (Button) findViewById(R.id.button);
        inputET = (EditText) findViewById(R.id.inputET);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    showSquare(Integer.valueOf(inputET.getText().toString()));
                }catch (NumberFormatException exc){
                    output.setText("Inputted information is not an integer");
                }
            }
        });
    }

    private void showSquare(int input) {
        int m = input;
        int n = 1;
        double root = Math.sqrt(m * n);

        while (Math.floor(root) != root) {
            root = Math.sqrt(m * ++n);
        }


        output.setText("Inputed int: "
                + m + "\nSmallest int for perfect square: "
                + n + "\nInput * Smallest int = " + (m * n));

    }
}
