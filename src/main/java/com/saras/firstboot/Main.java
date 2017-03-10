package com.saras.firstboot;

import com.saras.firstboot.annotation.FirstBootApplication;
import com.saras.firstboot.base.FirstBoot;

/**
 * description:
 * saras_xu@163.com 2017-03-10 15:25 创建
 */
@FirstBootApplication(env = "dev", port = 9094)
public class Main {
    public static void main(String[] args) {
        new FirstBoot().run(Main.class);
    }
}
