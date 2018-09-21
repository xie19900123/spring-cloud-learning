package cn.lqdev.learning.springcloud.eureka.consumer.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.lqdev.learning.springcloud.eureka.consumer.feign.HelloApi;
import cn.lqdev.learning.springcloud.eureka.consumer.feign.IHelloClient;
import lombok.extern.slf4j.Slf4j;

/**
 * feign 示例
 * @author OKong
 *
 */
@RestController
@Slf4j
public class DemoController {
	
	@Autowired
	IHelloClient helloClient;
	
	@Autowired
	HelloApi helloApi;
	
	@GetMapping("/hello") 
    public String hello(String name) {
    	log.info("使用feign调用服务，参数name:{}", name);
        return helloClient.hello(name);
    } 
	
	@GetMapping("hello2")
	public String hello2(String name) {
		log.info("使用feign继承方式调用服务，参数name:{}", name);
		return helloApi.helloApi(name);
	}
}
