package com.fx.config;

import com.fx.interceptor.LogingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author 成东日
 * @date 2020/2/8 18:23
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private LogingInterceptor logingInterceptor;
    //扩展ViewController
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hello").setViewName("hello");
    }

    //扩展添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logingInterceptor).addPathPatterns("/**")
                .excludePathPatterns("/login");
    }
}
