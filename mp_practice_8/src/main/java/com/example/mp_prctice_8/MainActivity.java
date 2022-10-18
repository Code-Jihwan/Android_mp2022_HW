package com.example.mp_prctice_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edt1, edt2;
    private Button btn;
    private TextView tv;
    int result;
    String x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText) findViewById(R.id.et1);
        edt2 = (EditText) findViewById(R.id.et2);

        btn = (Button) findViewById(R.id.btn1);
        tv = (TextView) findViewById(R.id.tv1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = edt1.getText().toString();
                y = edt2.getText().toString();

                result = Integer.parseInt(x) + Integer.parseInt(y);
                tv.setText(result);

                edt1.setText(""); edt2.setText("");
                edt1.requestFocus();
            }
        });
    }
}