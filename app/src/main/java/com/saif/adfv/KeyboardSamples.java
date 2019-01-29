package com.saif.adfv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class KeyboardSamples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyboard_samples);
    }

    public void showText(View view) {
        EditText editText = findViewById(R.id.editText_main);
        if (editText != null) {
            String showString = editText.getText().toString();
            Toast.makeText(this, showString, Toast.LENGTH_SHORT).show();
        }
    }
}
