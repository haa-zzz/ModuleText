package com.example.commlib;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public  abstract class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化 ARouter
        if (isDebug()) {
            // 这两行必须写在init之前，否则这些配置在init过程中将无效

            // 打印日志
            ARouter.openLog();
            // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
            ARouter.openDebug();
        }

        // 初始化 ARouter
        ARouter.init(this);
    }
    private boolean isDebug() {
        return BuildConfig.DEBUG;
    }
    /**
     * Application 初始化
     */
    public abstract void initModuleApp(Application application);
    /**
     * 所有 Application 初始化后的自定义操作
     */
    public abstract void initModuleData(Application application);
}
