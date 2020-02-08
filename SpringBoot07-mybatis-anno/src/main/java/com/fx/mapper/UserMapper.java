package com.fx.mapper;

import com.fx.domain.User;

import java.util.List;

/**
 * @author 成东日
 * @date 2020/2/8 19:02
 */
public interface UserMapper {
    /**
     * 保存
     * @param user user
     */
    void save(User user);

    /**
     * 加载所有
     *
     * @return {@link List<User>}
     */
    List<User> loadAll();
}
