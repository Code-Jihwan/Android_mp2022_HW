package com.example.mp_practice_3;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

// 연습문제 3번 작성.  (b): 모든 버튼이 한 개의 공통 수신자 사용
public class MainActivity2 extends Activity {
    private float size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click (View view) {
        TextView tv = (TextView) findViewById(R.id.txt);
        size = tv.getTextSize();

        switch (view.getId()) {
            case R.id.btn:
                size += 5;
                tv.setTextSize(size);
                break;

            case R.id.btn2:
                size -= 5;
                tv.setTextSize(size);
                break;
        }
    }
}
