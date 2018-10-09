package cn.lqdev.learning.springcloud.confg.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * config client 简单示例
 * @author oKong
 *
 */
@RestController
public class DemoController {

	@Value("${config}")
	String config;
	
	@GetMapping("/")
	public String demo() {
		return "返回的config参数值为:" + config;
	}
}
