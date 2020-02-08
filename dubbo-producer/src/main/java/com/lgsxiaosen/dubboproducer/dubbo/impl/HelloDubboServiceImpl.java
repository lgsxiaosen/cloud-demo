package com.lgsxiaosen.dubboproducer.dubbo.impl;

import com.lgsxiaosen.dubboproducer.dubbo.HelloDubboService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xiaosen
 * @date 2020/2/8 15:37
 * @description
 */
@Service
public class HelloDubboServiceImpl implements HelloDubboService {
    private static final Logger logger = LoggerFactory.getLogger(HelloDubboServiceImpl.class);

    @Override
    public String hello(String name) {
        String res = name + " hello dubbo !";
        logger.info("dubbo response = {}", res);
        return res;
    }
}
