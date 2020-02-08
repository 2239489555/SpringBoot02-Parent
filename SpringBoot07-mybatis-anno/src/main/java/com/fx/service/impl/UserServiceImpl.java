package com.fx.service.impl;

import com.fx.domain.User;
import com.fx.mapper.UserMapper;
import com.fx.service.UserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 成东日
 * @date 2020/2/8 19:04
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional
    @Override
    public void save(User user) {
        userMapper.save(user);
        //int i = 1/0;
    }

    @Transactional
    @Override
    public List<User> loadAll() {
        PageHelper.startPage(2,2);
        return userMapper.loadAll();
    }
}
