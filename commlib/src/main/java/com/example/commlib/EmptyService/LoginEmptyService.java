package com.example.commlib.EmptyService;

import com.example.commlib.service.LoginService;

public class LoginEmptyService implements LoginService {
    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return null;
    }
}
