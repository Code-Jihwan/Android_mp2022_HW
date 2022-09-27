package com.example.mp2022_mac;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//연습문제 2번 작성 (자기수신자)
public class MainActivity4 extends Activity implements View.OnClickListener{
    private float size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btn);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        TextView tv = (TextView) findViewById(R.id.txt);
        size = tv.getTextSize();
        size += 5;
        tv.setTextSize(size);
    }
}
