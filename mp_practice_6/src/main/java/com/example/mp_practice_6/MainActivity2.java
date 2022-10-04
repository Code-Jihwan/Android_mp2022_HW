package com.example.mp_practice_6;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

//연습문제 6번, b) CompoundButton.OnCheckedChangeListener 수신자 구현, 자기수신자 사용.
public class MainActivity2 extends Activity implements CompoundButton.OnCheckedChangeListener {
    private RadioButton[] rbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbs = new RadioButton[3];
        rbs[0] = findViewById(R.id.rb1);
        rbs[1] = findViewById(R.id.rb2);
        rbs[2] = findViewById(R.id.rb3);

        for (RadioButton rb : rbs)
            rb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (rbs[0].isChecked())
            Toast.makeText(MainActivity2.this, "9", Toast.LENGTH_SHORT).show();

        else if (rbs[1].isChecked())
            Toast.makeText(MainActivity2.this, "10", Toast.LENGTH_SHORT).show();

        else if (rbs[2].isChecked())
            Toast.makeText(MainActivity2.this, "11", Toast.LENGTH_SHORT).show();
    }
}
