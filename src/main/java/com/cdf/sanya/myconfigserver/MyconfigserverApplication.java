package com.cdf.sanya.myconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient //向注册中心注册的功能
@EnableConfigServer //配置中心的功能
public class MyconfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyconfigserverApplication.class, args);
    }

}
