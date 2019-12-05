package com.aaa.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : RibbonConfig
 * @Author : 彡樂
 * @Description :
 * @Date :2019/12/2 11:04
 **/
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return  new RestTemplate();
    }
}
