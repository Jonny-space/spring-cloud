package com.springcloud.jonny.euaekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuaekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuaekaServerApplication.class, args);
    }

}

