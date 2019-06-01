package com.ssm.service;

import com.ssm.pojo.User;

public interface UserService {

    User queryUserByaccount(String account);
    boolean register(User user);
    boolean checkAccount(String account);
}
