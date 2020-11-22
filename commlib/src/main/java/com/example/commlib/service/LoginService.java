package com.example.commlib.service;

public interface LoginService {
    /*
     * 是否已经登录
     */

    boolean isLogin();

    /*
     * 获取登录用户的 AccountId
     */
    String getAccountId();
}
