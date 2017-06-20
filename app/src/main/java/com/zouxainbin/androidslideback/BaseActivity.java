package com.zouxainbin.androidslideback;

import android.os.Bundle;
import android.util.Log;

import com.zouxianbin.android.slide.SlideBackAppCompatActivity;

/**
 * 这个是基类。为了统一实现左滑返回，也可以单个Activity中实现，只要继承SlideBackAppCompatActivity,
 * 在super.onCreate(savedInstanceState);之前调用setSlideable（）方法就行，但是每个项目中都有自己的基类，
 * 所以最好是让自己的基类继承SlideBackAppCompatActivity。因为SlideBackAppCompatActivity本身是继承AppCompatActivity的。
 * 如果不是继承Activity的，只有拿源码来修改ActivityInterfaceImpl里的继承实现
 *
 * 警告：在Activity实现中。setContentView时，只能传一个View,不能传一个layoutResID。
 * 因为 SlideBackAppCompatActivity重写的setContentView(View view);
 * 所以  setContentView(R.layout.activity_main2) 时，左滑返回是无效的
 */
public abstract class BaseActivity extends SlideBackAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //设置是否可以左滑返回，必须在super.onCreate（）之前
        setSlideable(isActivitySlideBack());

        Log.e("BaseActivity","isActivitySlideBack()="+isActivitySlideBack());

        super.onCreate(savedInstanceState);

    }

    public abstract boolean isActivitySlideBack();


}
