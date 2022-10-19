package com.example.mp_practice_15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button[] b;
    private String keys ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = new Button[12];
        b[0] = (Button) findViewById(R.id.btn1);
        b[1] = (Button) findViewById(R.id.btn2);
        b[2] = (Button) findViewById(R.id.btn3);
        b[3] = (Button) findViewById(R.id.btn4);
        b[4] = (Button) findViewById(R.id.btn5);
        b[5] = (Button) findViewById(R.id.btn6);
        b[6] = (Button) findViewById(R.id.btn7);
        b[7] = (Button) findViewById(R.id.btn8);
        b[8] = (Button) findViewById(R.id.btn9);
        b[9] = (Button) findViewById(R.id.btn10);
        b[10] = (Button) findViewById(R.id.btn11);
        b[11] = (Button) findViewById(R.id.btn12);

        for (Button btn : b)
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        keys += btn.getText();
                    if (keys.endsWith("6634783*"))
                        System.exit(0);
                }
            });
    }
}