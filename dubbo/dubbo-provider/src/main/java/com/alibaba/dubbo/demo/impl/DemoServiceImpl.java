package com.alibaba.dubbo.demo.impl;

import com.alibaba.dubbo.demo.DemoService;

/**
 * @Description:
 * @Author: zhujianli
 * @CreateDate: 2018/8/1 17:43
 * @Version: 1.0
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        return "Hello " + name;
    }

}

   /* public List<String> getPermissions(Long id) {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }*/

