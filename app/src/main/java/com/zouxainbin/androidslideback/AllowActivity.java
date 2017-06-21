package com.zouxainbin.androidslideback;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * 允许左滑返回的Activity
 */
public class AllowActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        //要想能左滑返回上一个Activity
        //设置setContentView必须是setContentView(view)
        //不能传一个layoutID
        setContentView(LayoutInflater.from(this).inflate(R.layout.activity_allow,null,false));

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(AllowActivity.this, AllowActivity.class));

            }
        });
    }

    @Override
    public boolean isActivitySlideBack() {
        //允许左滑返回
        return true;
    }
}
