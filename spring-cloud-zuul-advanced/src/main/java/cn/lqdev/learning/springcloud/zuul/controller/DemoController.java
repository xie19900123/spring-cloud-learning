package cn.lqdev.learning.springcloud.zuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * zuul 内部提供对外服务示例
 * @author oKong
 *
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/hello")
	public String hello(String name) {
		return "hi," + name + ",this is zuul api! ";
	}
}
