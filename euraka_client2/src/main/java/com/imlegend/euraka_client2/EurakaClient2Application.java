package com.imlegend.euraka_client2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class EurakaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurakaClient2Application.class, args);
    }
    @Value( "${server.port}" )
    private String port;

    @GetMapping("hi")
    public String hi() {
        return "hello , port is " + port;
    }
}
