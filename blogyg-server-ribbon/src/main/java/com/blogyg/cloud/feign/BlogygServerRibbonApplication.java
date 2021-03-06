package com.blogyg.cloud.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BlogygServerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogygServerRibbonApplication.class, args);
    }

}
