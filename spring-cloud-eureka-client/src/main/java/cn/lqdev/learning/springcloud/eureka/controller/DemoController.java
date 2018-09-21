package cn.lqdev.learning.springcloud.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * 简单api示例
 * @author oKong
 *
 */
@RestController
@Slf4j
public class DemoController {

	@GetMapping("/hello")
	public String index(String name) {
		log.info("[spring-cloud-eureka-client]服务被调用，参数name值为：{}", name);
		return name + ",this is spring-cloud-eureka-client!";
	}	
}
