package cn.lqdev.learning.springcloud.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * 访问客户端示例
 * @author oKong
 *
 */
@RestController
@Slf4j
public class DemoController {

	@Autowired
    LoadBalancerClient loadBalancerClient;
	
    @Autowired 
    RestTemplate restTemplate;
    
    @GetMapping("/hello") 
    public String hello(String name) {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/hello?name=" + name;
        log.info("url地址为：{}", url);
        return restTemplate.getForObject(url, String.class);
    } 
}
