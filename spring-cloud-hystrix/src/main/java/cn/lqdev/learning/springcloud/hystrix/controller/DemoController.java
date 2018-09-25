package cn.lqdev.learning.springcloud.hystrix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import lombok.extern.slf4j.Slf4j;

/** 
*
* @ClassName   类名：DemoController 
* @Description 功能说明：
* <p>
* TODO
*</p>
************************************************************************
* @date        创建日期：2018年9月26日
* @author      创建人：xds
* @version     版本号：V1.0
*<p>
***************************修订记录*************************************
* 
*   2018年9月26日   xds   创建该类功能。
*
***********************************************************************
*</p>
*/
@RestController
@Slf4j
public class DemoController {
	
	@GetMapping("/demo")
	@HystrixCommand(fallbackMethod="fallback")	
	public String demo(String name) {
		return "demo!!";
	}
	
	/**
	 * 发生异常时调用的方法
	 * @param name
	 * @param throwable 发生异常时的异常信息
	 * @return
	 */
	public String fallback(String name,Throwable throwable) {
		log.error("发生异常", throwable);
		log.warn("restTemplate调用服务发生异常，参数name:{}", name);
		return "restTemplate调用服务发生异常，参数name：" + name;
	}
}
