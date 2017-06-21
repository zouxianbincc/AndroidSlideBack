package com.zouxainbin.androidslideback;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //允许左滑返回的Activity
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AllowActivity.class));
            }
        });

        //不允许左滑返回的Activity
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NotAllowActivity.class));
            }
        });
    }

    @Override
    public boolean isActivitySlideBack() {
        //首页不允许滑动返回
        return false;
    }
}
