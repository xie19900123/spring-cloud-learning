package cn.lqdev.learning.springcloud.eureka.consumer.ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

/**
 * ribbon访问客户端示例
 * @author oKong
 *
 */
@RestController
@Slf4j
public class DemoController {
	
    @Autowired
    @Qualifier("balanedRestTemplate")
    RestTemplate restTemplate;
    
    @Autowired
    @Qualifier("normalRestTemplage")
    RestTemplate normalRestTemplate;
    
    
    @GetMapping("/hello") 
    public String hello(String name) {
    	//直接使用服务名进行访问
    	log.info("请求参数name:{}", name);
        return restTemplate.getForObject("http://eureka-client/hello?name=" + name, String.class);
    } 
    
    @GetMapping("/ip") 
    public String ip(String name) {
    	
    	//直接使用服务名进行访问
    	log.info("使用ip请求，请求参数name:{}", name);
        return normalRestTemplate.getForObject("http://127.0.0.1:2000/hello?name=" + name, String.class);
    } 
}
