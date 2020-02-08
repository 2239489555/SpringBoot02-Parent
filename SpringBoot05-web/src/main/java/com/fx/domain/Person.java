package com.fx.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author 成东日
 * @date 2020/2/8 18:20
 */
@Data
public class Person {
    private Long id;
    private String name;
    private Date birthDay;

    public Person() {
    }

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
