package com.example.moduletextt;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        button1.setOnClickListener(v -> ARouter.getInstance().build("/account1/home")
                .withString("username","张三")
                .navigation());
        button2.setOnClickListener(v -> ARouter.getInstance().build("/accoun/login").navigation());
    }
}