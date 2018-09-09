package cn.lqdev.learning.eureka.service.ha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 调用简单示例
 * @author oKong
 *
 */
@RestController
public class DemoController {

	@Autowired
	private RestTemplate testTemplate;
	
	@GetMapping("/")
	public String index() {
		//访问服务提供者
		return testTemplate.getForObject("http://EUREKA-CLIENT/", String.class);
	}
}
