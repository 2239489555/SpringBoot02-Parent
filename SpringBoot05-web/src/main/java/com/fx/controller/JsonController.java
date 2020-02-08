package com.fx.controller;

import com.fx.domain.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author 成东日
 * @date 2020/2/8 18:24
 */
@RestController
@RequestMapping("/json")
public class JsonController {
    @RequestMapping("/str")
    public String jsonStr(){
        return "jsonStr";
    }


    @RequestMapping("/obj")
    public Person jsonObj(){
        Person zs = new Person(1L, "zs");
        zs.setBirthDay(new Date());
        return zs;
    }


    @RequestMapping("/arr")
    public List<Person> jsonArray(){
        return Arrays.asList(new Person(1L,"zs")
                ,new Person(2L,"ls"));
    }

    /**
     *     返回页面
     */
    @RequestMapping("/jsp")
    public ModelAndView jsp(){
        //会到classpath:/templates/hello.html
        return new ModelAndView("hello",
                "msg","asdasdagas");

    }
}
