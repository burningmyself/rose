package cn.burningmyself.roseconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class RoseconfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(RoseconfigApplication.class, args);
    }

}
