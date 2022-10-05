package com.example.mp_practice_6;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

//연습문제 6번, c) RadioGroup.OnCheckedChangeListener 수신자 구현, 익명의 내부 수신자 사용.
public class MainActivity3 extends Activity {
    private RadioButton[] rbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        rbs = new RadioButton[3];
        rbs[0] = (RadioButton) findViewById(R.id.rb1);
        rbs[1] = (RadioButton) findViewById(R.id.rb2);
        rbs[2] = (RadioButton) findViewById(R.id.rb3);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                if (rbs[0].isChecked())
                    Toast.makeText(MainActivity3.this, "9", Toast.LENGTH_LONG).show();

                else if (rbs[1].isChecked())
                    Toast.makeText(MainActivity3.this, "10", Toast.LENGTH_LONG).show();

                else if (rbs[2].isChecked())
                    Toast.makeText(MainActivity3.this, "11", Toast.LENGTH_LONG).show();
            }
        });
    }
}