package com.example.moduletextt;

import android.app.Application;

import com.example.commlib.App;
import com.example.commlib.AppConfig;

public class MainApp extends App {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化组件 Application
        initModuleApp(this);

        // 其他操作
        // 所有 Application 初始化后的操作
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        for(String moduleApp: AppConfig.moduleApps){
            try{
                Class clazz = Class.forName(moduleApp);
                App app = (App)clazz.newInstance();
                app.initModuleApp(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void initModuleData(Application application) {
        for(String moduleApp: AppConfig.moduleApps){
            try{
                Class clazz = Class.forName(moduleApp);
                App app = (App)clazz.newInstance();
                app.initModuleData(this);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

    }
}
