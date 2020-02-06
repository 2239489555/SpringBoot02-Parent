package com.fx.controller;

import com.fx.config.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 成东日  2020/2/6.
 */
@Controller
public class HelloController {
    @Autowired
    private Person person;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(person.getLastName());
        System.out.println(person);
        return "Hello World";
    }
}