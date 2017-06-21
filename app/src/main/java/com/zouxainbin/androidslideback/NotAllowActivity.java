package com.zouxainbin.androidslideback;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * 不允许左滑返回的Activity
 */
public class NotAllowActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_allow);

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(NotAllowActivity.this, NotAllowActivity.class));

            }
        });


    }

    @Override
    public boolean isActivitySlideBack() {
        //不允许滑动返回
        return false;
    }
}
