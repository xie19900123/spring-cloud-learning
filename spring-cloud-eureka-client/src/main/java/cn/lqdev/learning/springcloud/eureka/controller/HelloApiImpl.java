package cn.lqdev.learning.springcloud.eureka.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.lqdev.learning.springcloud.eureka.client.api.IHelloApi;
import lombok.extern.slf4j.Slf4j;

/**
 * 使用接口方式进行接口编写
 * @author oKong
 *
 */
@RestController
@Slf4j
public class HelloApiImpl implements IHelloApi {
	
	@Override
	public String helloApi(@RequestParam("name") String name) {
		log.info("[spring-cloud-eureka-client]服务[helloApi]被调用，参数name值为：{}", name);
		return name + ",helloApi调用!";
	}
}
