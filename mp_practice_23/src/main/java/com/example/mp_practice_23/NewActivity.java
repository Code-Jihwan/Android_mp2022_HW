package com.example.mp_practice_23;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class NewActivity extends AppCompatActivity implements OnClickListener {
    private ImageButton[] imgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        imgbtn = new ImageButton[3];
        imgbtn[0] = (ImageButton) findViewById(R.id.imgb1);
        imgbtn[1] = (ImageButton) findViewById(R.id.imgb2);
        imgbtn[2] = (ImageButton) findViewById(R.id.imgb3);

        for (int i=0; i<3; i++)
            imgbtn[i].setOnClickListener(this);   //수신자 등록. 자기 수신자 사용.
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(NewActivity.this, SubActivity.class);
        switch (view.getId()) { //눌러진 버튼 알아내기
            case R.id.imgb1:
                intent.putExtra("m1", "China");
                startActivity(intent);
                break;

            case R.id.imgb2:
                intent.putExtra("m1", "Korea");
                startActivity(intent);
                break;

            case R.id.imgb3:
                intent.putExtra("m1", "Japan");
                startActivity(intent);
                break;
        }
    }
}