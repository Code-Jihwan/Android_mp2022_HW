package com.example.mp_practice_22;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        Intent intent = getIntent();
        int z = intent.getIntExtra("color", 0);
        TextView tv = (TextView) findViewById(R.id.textview);
        String hex = Integer.toHexString(z);
        tv.setText("Hex Code = ff" + hex);

        int m1 = Integer.parseInt(hex);
        Button btn = (Button) findViewById(R.id.button);
        btn.setBackgroundColor(m1);

        //tv.setText("Hex Code = " + String.valueOf(intent.getIntExtra("color", 0)));
        //int z = intent.getIntExtra("color", 0);
        //Button btn = (Button) findViewById(R.id.button);
        //btn.setBackgroundColor(n);
        //tv0.setTextColor(Color.parseColor(String.valueOf(z)));
    }
}