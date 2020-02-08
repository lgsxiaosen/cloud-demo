package com.lgsxiaosen.dubboconsumer.service.impl;

import com.lgsxiaosen.dubboconsumer.service.DubboTestService;
import com.lgsxiaosen.dubboproducer.dubbo.HelloDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author xiaosen
 * 2020/2/8 16:03
 */
@Service
public class DubboTestServiceImpl implements DubboTestService {
    private static final Logger logger = LoggerFactory.getLogger(DubboTestServiceImpl.class);

    @Reference
    private HelloDubboService helloDubboService;

    @Override
    public String dubboTest(String name) {
        String response = helloDubboService.hello(name);
        logger.info("dubbo return {}", response);
        return response;
    }
}
