package com.jin.druid.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wu.jinqing
 * @date 2018年09月03日
 */
@SpringBootApplication(exclude = {})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
