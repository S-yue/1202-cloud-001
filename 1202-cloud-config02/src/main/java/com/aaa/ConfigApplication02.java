package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName : ConfigApplication
 * @Author : 彡樂
 * @Description :
 * @Date :2019/12/4 10:31
 **/
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication02 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication02.class, args);
    }
}
