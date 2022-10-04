package com.example.mp_practice_5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

//연습문제 5번, b) CompoundButton.OnCheckedChangeListener 수신자 구현, 자기수신자 사용.
public class MainActivity2 extends Activity implements CompoundButton.OnCheckedChangeListener {
    private ToggleButton[] tbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbs = new ToggleButton[3];
        tbs[0] = (ToggleButton) findViewById(R.id.tg1);
        tbs[1] = (ToggleButton) findViewById(R.id.tg2);
        tbs[2] = (ToggleButton) findViewById(R.id.tg3);

        for (ToggleButton tg : tbs)
            tg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        String s = "";
        for (int i=0; i<3; i++)
            if (tbs[i].isChecked())
                s += i + 1;
        int t1 = Integer.parseInt(s,2);
        Toast.makeText(MainActivity2.this, t1, Toast.LENGTH_LONG).show();
    }
}
