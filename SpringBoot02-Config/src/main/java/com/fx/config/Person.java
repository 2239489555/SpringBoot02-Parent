package com.fx.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 成东日  2020/2/6.
 */
@Component
//方式2：统一配置
//默认从application.yml或properties
@ConfigurationProperties(prefix = "person")
@PropertySource(value = {"classpath:person.properties"})
@Data
public class Person {
    //方式1：获取值 @value(${xxx.yyy})
    //@Value("${person.lastName}")
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;

    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;
}
