package com.zjj.service.impl;

import com.zjj.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return name+"welcome to service";
    }
}
