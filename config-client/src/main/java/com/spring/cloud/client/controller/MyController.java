package com.spring.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author xudd
 * @Date 2019/4/28 0028 下午 10:53
 */
@RestController
public class MyController {

    @Value("${myww}") // git配置文件里的key
            String myww;

    @RequestMapping(value = "/hi")
    public String hi(){
        return myww;
    }
}
