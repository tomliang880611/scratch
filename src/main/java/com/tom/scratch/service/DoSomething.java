package com.tom.scratch.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DoSomething{
    private static Logger logger = LoggerFactory.getLogger(DoSomething.class);

    public void sayHello () {
        logger.info("please say hello...");
    }
}
