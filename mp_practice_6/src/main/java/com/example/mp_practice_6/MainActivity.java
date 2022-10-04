package com.example.mp_practice_6;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

//연습문제 6번, a) View.OnClickListener 수신자 구현, 익명의 내부 수신자 사용.
public class MainActivity extends Activity {
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
            rb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (rbs[0].isChecked())
                        Toast.makeText(MainActivity.this, "9", Toast.LENGTH_LONG).show();

                    else if (rbs[1].isChecked())
                        Toast.makeText(MainActivity.this, "10", Toast.LENGTH_LONG).show();

                    else if (rbs[2].isChecked())
                        Toast.makeText(MainActivity.this, "11", Toast.LENGTH_LONG).show();
                }
            });
    }
}