package com.ssm.service.imp;

import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import com.ssm.pojo.UserExample;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryUserByaccount(String account) {
        UserExample example=new UserExample();
        example.createCriteria().andUAccountEqualTo(account);
        List<User> users = userMapper.selectByExample(example);
        if(users!=null&&users.size()>0){
            return users.get(0);
        }
        return null;
    }

    @Override
    public boolean register(User user) {
        int i = userMapper.insertSelective(user);
        return i>0;
    }

    @Override
    public boolean checkAccount(String account) {
        UserExample example=new UserExample();
        example.createCriteria().andUAccountEqualTo(account);
        List<User> users = userMapper.selectByExample(example);

        return users.size()>0;
    }
}
