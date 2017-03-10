package com.saras.firstboot.web;

import com.saras.firstboot.config.EnvConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description:
 * saras_xu@163.com 2017-03-10 15:31 创建
 */
@Controller
public class TestController {
    @Autowired
    private EnvConfig envConfig;

    @RequestMapping("")
    @ResponseBody
    public Object hello() {
        return "hello：" + envConfig.getName();
    }
}
