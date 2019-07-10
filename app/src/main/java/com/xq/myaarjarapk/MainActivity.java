package com.xq.myaarjarapk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.blankj.utilcode.util.LogUtils;
import com.xq.myandroidlibrary.MyAndroidTest;
import com.xq.myjavalib.MyJavaTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String printAndroid = MyAndroidTest.print();
        String printJava = MyJavaTest.print();
        LogUtils.e("=======android 调用 Android module :" + printAndroid);
        LogUtils.e("=======android 调用 java module :" + printJava);
    }
}
