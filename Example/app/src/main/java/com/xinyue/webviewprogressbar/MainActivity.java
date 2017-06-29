package com.xinyue.webviewprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private WebViewProgressBar mProgressBar;
    private boolean canReply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgressBar =  (WebViewProgressBar)findViewById(R.id.progress);
    }
    public void onSetRed(View v){
        Button button = (Button)v;
        if(canReply){
            button.setText("设置进度条为红色");
            mProgressBar.setProgressColor(0xff4fd922);
            canReply = false;
        }else{
            button.setText("恢复原来颜色");
            mProgressBar.setProgressColor(0xffff0000);
            canReply = true;
        }
    }
    public void onTest1(View v){
        mProgressBar.setProgress(20);
    }
    public void onTest2(View v){
        mProgressBar.setProgress(60);
    }
    public void onTest3(View v){
        mProgressBar.setProgress(100);

    }
}
