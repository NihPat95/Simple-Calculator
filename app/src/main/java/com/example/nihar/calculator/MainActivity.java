package com.example.nihar.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText e1 = null;
    public EditText e2 = null;
    public Button add = null;
    public Button sub = null;
    public Button mul = null;
    public Button div = null;

    public TextView result = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Tag","Testing");
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        add = (Button) findViewById(R.id.button);
        sub = (Button) findViewById(R.id.button1);
        mul = (Button) findViewById(R.id.button2);
        div = (Button) findViewById(R.id.button3);
        result = (TextView) findViewById(R.id.textView3);

    }
    public void add_number(View view){
        try {
            Float one = Float.parseFloat(e1.getText().toString());
            Float two = Float.parseFloat(e2.getText().toString());
            Float r = one + two;
            String s = r.toString();
            Log.v("Tag","add");
            result.setText("Result: "+s);
            Toast.makeText(MainActivity.this, "Added", Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            Log.v("Tag",e.getMessage());
        }
    }
    public void sub_number(View view){
        try {
            Float one = Float.parseFloat(e1.getText().toString());
            Float two = Float.parseFloat(e2.getText().toString());
            Float r = one - two;
            String s = r.toString();
            Log.v("Tag","sub");
            result.setText("Result: "+s);
            Toast.makeText(MainActivity.this, "Subtracted", Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            Log.v("Tag",e.getMessage());
        }
    }
    public void mul_number(View view){
        try {
            Float one = Float.parseFloat(e1.getText().toString());
            Float two = Float.parseFloat(e2.getText().toString());
            Float r = one * two;
            String s = r.toString();
            Log.v("Tag","mul");
            result.setText("Result: "+s);
            Toast.makeText(MainActivity.this, "Multiplied", Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            Log.v("Tag",e.getMessage());
        }
    }
    public void div_number(View view){
        try {
            Float one = Float.parseFloat(e1.getText().toString());
            Float two = Float.parseFloat(e2.getText().toString());
            Float r = one / two;
            String s = r.toString();
            Log.v("Tag","div");
            result.setText("Result: "+s);
            Toast.makeText(MainActivity.this, "Divided", Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            result.setText("Divide By Zero");
        }
    }

}
