package com.lgsxiaosen.dubboconsumer.controller;

import com.lgsxiaosen.dubboconsumer.service.DubboTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaosen
 * 2020/2/8 16:13
 */
@RestController
public class DubboController {

    @Autowired
    private DubboTestService dubboTestService;

    @GetMapping("/test")
    public String dubboTest(@RequestParam(value = "name") String name){
        return dubboTestService.dubboTest(name);
    }

}
