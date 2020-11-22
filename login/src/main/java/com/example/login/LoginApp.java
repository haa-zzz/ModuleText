package com.example.login;

import android.app.Application;

import com.example.commlib.App;
import com.example.commlib.ServiceFactory;

public class LoginApp extends App {
    @Override
    public void onCreate() {
        super.onCreate();
        // 将 LoginServiceClass 类的实例注册到 ServiceFactory

        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setLoginservice(new LoginServiceClass());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
