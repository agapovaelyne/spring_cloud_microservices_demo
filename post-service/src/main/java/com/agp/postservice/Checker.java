package com.agp.postservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Checker {
    @Autowired
    private Environment env;

    @PostConstruct
    public void init() {
        System.out.printf("{}={}", "app.description", env.getProperty("app.description"));
    }
}
