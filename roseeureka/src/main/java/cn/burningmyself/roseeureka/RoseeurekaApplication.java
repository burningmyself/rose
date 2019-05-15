package cn.burningmyself.roseeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@EnableEurekaClient
public class RoseeurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoseeurekaApplication.class, args);
    }

}
