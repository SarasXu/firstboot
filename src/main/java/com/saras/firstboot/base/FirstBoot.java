package com.saras.firstboot.base;

import com.saras.firstboot.annotation.FirstBootApplication;
import com.saras.firstboot.utils.Apps;
import org.springframework.boot.SpringApplication;

/**
 * description:
 * saras_xu@163.com 2017-03-10 10:50 创建
 */
public class FirstBoot {

    public void run(Class clazz, String... args) {
        long begin = System.currentTimeMillis();
        FirstBootApplication boot = (FirstBootApplication) clazz.getAnnotation(FirstBootApplication.class);
        Apps.setProfileIfNotExists(boot.env());
        Apps.setPort(String.valueOf(boot.port()));
        SpringApplication.run(clazz);
        long end = System.currentTimeMillis();
        System.out.println("********************************************************");
        long time = end - begin;
        System.out.println("启动成功[port：" + boot.port() + "   profile：" + Apps.getProfile() + "   in:" + time + "ms]");
        System.out.println("********************************************************");
    }
}
