package com.boot.kube.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements ApplicationRunner {
    private final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("### VER1 Spring Boot K8s Deployment Rollout Test !! ###");
    }
}
