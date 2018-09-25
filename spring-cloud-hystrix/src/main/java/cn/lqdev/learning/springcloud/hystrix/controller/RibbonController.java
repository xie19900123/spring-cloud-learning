package cn.lqdev.learning.springcloud.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import lombok.extern.slf4j.Slf4j;

/**
 * ribbon 常规方式-示例
 * @author oKong
 *
 */
@RestController
@Slf4j
public class RibbonController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/ribbon")
	@HystrixCommand(fallbackMethod="fallback")
	public String ribbon(String name) {
		log.info("使用restTemplate调用服务，参数name:{}", name);
		return restTemplate.getForObject("http://eureka-client/hello?name=" + name, String.class);
	}
	
	/**
	 * 发生异常时调用的方法
	 * @param name
	 * @param throwable 发生异常时的异常信息
	 * @return
	 */
	public String fallback(String name,Throwable throwable) {
		log.error("发生了异常", throwable);
		log.warn("restTemplate调用服务发生异常，参数name:{}", name);
		return "restTemplate调用服务发生异常，参数name：" + name;
	}
}
