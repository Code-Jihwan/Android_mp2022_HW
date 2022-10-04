package com.example.mp_practice_6;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

//연습문제 6번, c) RadioGroup.OnCheckedChangeListener 수신자 구현, 익명의 내부 수신자 사용.
public class MainActivity3 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                RadioButton rb = (RadioButton) findViewById(id);


                Toast.makeText(MainActivity3.this, rb.getText(), Toast.LENGTH_LONG).show();

            }
        });
    }
}