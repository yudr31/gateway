package com.spring.boot.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author yuderen
 * @version 2019/7/23 17:08
 */
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication(scanBasePackages = "com.spring.boot")
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
