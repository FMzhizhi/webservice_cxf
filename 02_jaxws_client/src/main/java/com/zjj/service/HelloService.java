package com.zjj.service;

import javax.jws.WebService;

/**
 * 对外发布的服务接口
 */
@WebService
public interface HelloService {

    String hello(String name);

}
