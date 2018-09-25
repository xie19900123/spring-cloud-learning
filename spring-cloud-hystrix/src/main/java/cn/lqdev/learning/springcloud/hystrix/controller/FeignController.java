package cn.lqdev.learning.springcloud.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.lqdev.learning.springcloud.hystrix.api.IHelloClient;
import lombok.extern.slf4j.Slf4j;

/**
 * feign 熔断器示例
 * @author oKong
 *
 */
@RestController
@Slf4j
public class FeignController {

	@Autowired
	IHelloClient helloClient;
	
	@GetMapping("/feign")
	public String feign(String name) {
		log.info("使用feign调用服务，参数name:{}", name);
		return helloClient.hello(name);
	}
	
}
