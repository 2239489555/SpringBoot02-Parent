package com.fx.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 成东日
 * @date 2020/2/8 18:11
 */
@Controller
public class HelloController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        logger.trace("trace...........");
        logger.debug("debug...........");
        logger.info("info.............");
        logger.warn("warn.............");
        logger.error("error...........");
        return "🐕🐕🐕";
    }
}
