package com.example.login;

import com.example.commlib.service.LoginService;

public class LoginServiceClass implements LoginService {
    @Override
    public boolean isLogin() {
        return true;
    }

    @Override
    public String getAccountId() {
        return "传递id";
    }
}
