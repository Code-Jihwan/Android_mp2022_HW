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
        for (ToggleButton tg : tbs)
            s += tg.isChecked()? "1" : "0";       // 조건식? 반환값1 : 반환값2
        int t1 = Integer.parseInt(s,2);     // s 값을 이진수 -> 10진수 변환
        String t2 = Integer.toString(t1);         // 정수값 t1을 문자열로 바꿈.
        Toast.makeText(MainActivity2.this, t2, Toast.LENGTH_LONG).show();
    }
}
