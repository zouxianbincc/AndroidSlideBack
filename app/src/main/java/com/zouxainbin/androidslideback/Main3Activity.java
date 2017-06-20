package com.zouxainbin.androidslideback;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

/**
 * 允许左滑返回的Activity
 */
public class Main3Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(LayoutInflater.from(this).inflate(R.layout.activity_main3,null,false));

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Main3Activity.this, Main3Activity.class));

            }
        });
    }

    @Override
    public boolean isActivitySlideBack() {
        //允许左滑返回
        return true;
    }
}
