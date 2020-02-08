package com.fx.domain;

import lombok.Data;

/**
 * @author 成东日
 * @date 2020/2/8 19:00
 */
@Data
public class User {
    private Long id;
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
}
