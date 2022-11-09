package com.example.mp_practice_19;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;

public class MyView extends View {      //MyView는 view의 하위 클래스
    private Paint paint;
    private int x, y;   //임이의 좌표 지정

    public MyView(Context context) {
        super(context);
        paint = new Paint();
        x = y = 2;  //초기값 설정 (처음에는 박스가 중앙에 그려지도록 하기 위해)
    }

    public void left() {    //left 메소드를 둔다.
        if (--x < 0)    //x좌표를 감소 시킴
            x = 0;      //감소 시키는데 음수면 x를 0으로 고정함
        invalidate();   //그림을 다시 그림
        Log.e("1111","11111");
    }

    public void right() {
        if (++x > 4)
            x = 4;
        invalidate();
        Log.e("22222","2222222");
    }

    public void up() {
        if (--y < 0)
            y = 0;
        invalidate();
        Log.e("33333","3333");
    }

    public void down() {
        if (++y > 4)    //y좌표 값을 증가 시키는데
            y = 4;      //y좌표 값이 4보다 클수 없고, 만약 넘으면  y값을 4로 고정
        invalidate();   //그림을 다시 그림
        Log.e("444444444","44444444");
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);   //자기 부모 클래스에 onDraw를 부름
        canvas.drawRGB(255,255,0);  //캔버스 = 도화지 색

        paint.setStrokeWidth(2); //선 굵기
        int width = getWidth();
        int height = getHeight();
        int w = width/5;
        int h = height/5;
        paint.setColor(Color.BLACK);    //선 색 지정
        for (int i=1; i<5; i++) {
            canvas.drawLine(0,i*h, width, i*h, paint);  //가로줄 그리기
            canvas.drawLine(i*w,0, i*w, height, paint);  //세로줄 그리기
        }

        paint.setColor(Color.RED);  //사각형의 색 지정
        canvas.drawRect(w*x, h*y, w*(x+1), h*(y+1), paint); //사각형의 좌표 설정
    }
}