package com.fx.service.impl;

import com.fx.domain.User;
import com.fx.mapper.UserMapper;
import com.fx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 成东日
 * @date 2020/2/8 19:04
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public List<User> loadAll() {
        return userMapper.loadAll();
    }
}
