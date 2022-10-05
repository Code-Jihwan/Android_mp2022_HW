package com.example.mp_practice_3;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// 연습문제 3번 작성.  (a): 각 버튼마다 별도 수신자 사용.
// (+ 버튼은 익명의 내부 클래스 수신자 사용, - 버튼은 내부 클래스 수신자 사용)
public class MainActivity extends Activity {
    private float size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.txt);
        Button button1 = (Button) findViewById(R.id.btn);

        // + 버튼은 익명의 내부 클래스 수신자 사용
        button1.setOnClickListener(new View.OnClickListener() {
            float size = tv.getTextSize();
            @Override
            public void onClick(View view) {
                size += 5;
                tv.setTextSize(size);
            }
        });

        Button button2 = (Button) findViewById(R.id.btn2);
        button2.setOnClickListener(new MyListener());
    }

    // -버튼은 내부 클래스 수신자 사용
    private class MyListener implements View.OnClickListener {
        TextView tv = (TextView) findViewById(R.id.txt);
        float size = tv.getTextSize();
        @Override
        public void onClick(View view) {
            size -= 5;
            tv.setTextSize(size);
        }
    }
}
