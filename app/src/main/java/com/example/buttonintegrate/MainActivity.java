package com.example.buttonintegrate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onDisplay(View v){
        editText1=(EditText) findViewById(R.id.editText1);
        String message=editText1.getText().toString();
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
    }
}
