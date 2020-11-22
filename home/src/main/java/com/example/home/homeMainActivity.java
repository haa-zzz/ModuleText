package com.example.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.commlib.ServiceFactory;
@Route(path = "/account1/home")
public class homeMainActivity extends AppCompatActivity {
    @Autowired(name = "username")
    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_main);
        ARouter.getInstance().inject(this);   //注入
        Log.d("MainActivity",username);
        IsLogin();
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        button1.setOnClickListener(v -> ARouter.getInstance().build("/account/pay")
                .navigation());
        button2.setOnClickListener(v -> ARouter.getInstance().build("/accoun/login").navigation());

    }

    private void gotoLogin() {
        ARouter.getInstance().build("/accoun/login").navigation();
    }

    private void IsLogin() {
        if(ServiceFactory.getInstance().getLoginservice().isLogin()){
            Toast.makeText(this,"已经登录",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"没有登录",Toast.LENGTH_LONG).show();
        }
    }
}