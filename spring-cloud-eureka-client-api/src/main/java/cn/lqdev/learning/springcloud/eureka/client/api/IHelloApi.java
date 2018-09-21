package cn.lqdev.learning.springcloud.eureka.client.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface IHelloApi {
	//定义提供者服务名
	public static final String SERVICE_NAME = "eureka-client";
	
	/**
	 * 定义接口
	 * @param name
	 * @return
	 */
	@RequestMapping(value="/hello2", method=RequestMethod.GET)
	public String helloApi(@RequestParam("name") String name);
}
