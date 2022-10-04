package com.example.mp_practice_4;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

//연습문제 4번, b) CompoundButton.OnCheckedChangeListener 수신자 구현, 자기수신자 사용.
public class MainActivity2 extends Activity implements CompoundButton.OnCheckedChangeListener{
    private CheckBox[] cbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbs = new CheckBox[2];
        cbs[0] = (CheckBox) findViewById(R.id.cb1);
        cbs[1] = (CheckBox) findViewById(R.id.cb2);

        TextView tv = findViewById(R.id.text);
        tv.setText("One");

        for (CheckBox cb : cbs)
            cb.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        TextView tv = findViewById(R.id.text);
        String s = "";
        for (int i=0; i<2; i++)
            if (cbs[i].isChecked())
                s += cbs[i].getText();
        tv.setText(s);
    }
}
