package cn.lqdev.learning.springcloud.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简单api示例
 * @author oKong
 *
 */
@RestController
public class DemoController {

	@GetMapping("/")
	public String index() {
		return "spring-cloud-eureka-client!";
	}
}
