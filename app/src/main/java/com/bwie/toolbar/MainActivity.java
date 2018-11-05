package com.bwie.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //设置控件
        toolbar = findViewById(R.id.toolbar);

        //设置主标题
        toolbar.setTitle("ChangeYourMind");

        //设置副标题
        toolbar.setSubtitle("For Yourself");

        //设置ToolBar
        setSupportActionBar(toolbar);

        //设置系统默认的返回箭头
        //注:必须要设置在ToolBar后,否则没效果
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
