package com.example.mp_practice_4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

//연습문제 4번, a) View.OnClickListener 수신자 구현, 익명의 내부 수신자 사용.
public class MainActivity extends Activity {
    private CheckBox[] cbs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = findViewById(R.id.text);

        cbs = new CheckBox[2];
        cbs[0] = (CheckBox) findViewById(R.id.cb1);
        cbs[1] = (CheckBox) findViewById(R.id.cb2);

        tv.setText("One");

        for (CheckBox cb : cbs)
            cb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String s = "";
                    for (int i=0; i<2; i++)
                        if (cbs[i].isChecked())
                            s += cbs[i].getText();
                    tv.setText(s);
                }
            });
    }
}
