package com.burningmyself.rosezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class RosezuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(RosezuulApplication.class, args);
    }

}
