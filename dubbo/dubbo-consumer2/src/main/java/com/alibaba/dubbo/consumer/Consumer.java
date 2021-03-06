package com.alibaba.dubbo.consumer;

import com.alibaba.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: zhujianli
 * @CreateDate: 2018/8/1 17:39
 * @Version: 1.0
 */
public class Consumer {
    public static void main(String[] args) {

        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer2 start");
        DemoService demoService = context.getBean(DemoService.class);
        System.out.println("consumer2");
        //System.out.println(demoService.getPermissions(1L));
    }
}
