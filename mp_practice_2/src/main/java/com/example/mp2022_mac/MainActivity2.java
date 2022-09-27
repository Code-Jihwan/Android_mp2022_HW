package com.example.mp2022_mac;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//연습문제 2번 작성 (내부 클래스 수신자)
public class MainActivity2 extends Activity {
    private float size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(new MyListener());
    }

    private class MyListener implements View.OnClickListener {
        TextView tv = (TextView) findViewById(R.id.txt);
        float size = tv.getTextSize();
        @Override
        public void onClick(View view) {
            size += 5;
            tv.setTextSize(size);
        }
    }
}