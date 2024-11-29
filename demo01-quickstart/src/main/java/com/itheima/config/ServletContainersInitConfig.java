package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * @Author: Song Laixiong
 * @Create: 2024-11-29
 * @Description:
 */

public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {

    // 加载 SpringMVC 配置文件，创建springmvc容器
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        // 初始化 webApplicationContext 对象
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        // 加载指定配置类，初始化容器
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    // 设置 SpringMVC 容器请求拦截规则
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // 加载 Spring 配置文件，创建 Spring 容器
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
