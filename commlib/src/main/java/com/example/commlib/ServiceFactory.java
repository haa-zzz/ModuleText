package com.example.commlib;

import com.example.commlib.EmptyService.LoginEmptyService;
import com.example.commlib.service.LoginService;

public class ServiceFactory {
    private LoginService loginservice;
    /**
     * 禁止外部创建 ServiceFactory 对象
     */
    private ServiceFactory() {
    }
    private static class Inner {
        private static final ServiceFactory serviceFactory = new ServiceFactory();
    }
    /**
     * 通过静态内部类方式实现 ServiceFactory 的单例
     */
    public static ServiceFactory getInstance() {
        return Inner.serviceFactory;
    }

    public LoginService getLoginservice() {
        if(loginservice==null){
            loginservice = new LoginEmptyService();
        }
        return loginservice;
    }

    public void setLoginservice(LoginService loginservice) {
        this.loginservice = loginservice;
    }
}
