package cn.lqdev.learning.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import cn.lqdev.learning.springcloud.zuul.config.AccessZuulFilter;
import cn.lqdev.learning.springcloud.zuul.config.CustomErrorFilter;
import cn.lqdev.learning.springcloud.zuul.config.MyEurekaClientFallback;
import lombok.extern.slf4j.Slf4j;

/**
 * zuul-进阶 自定义过滤器、异常处理等
 * 
 * @author oKong
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Slf4j
public class SpringCloudZuulApplication {
	public static void main(String[] args) throws Exception {
		
	 	SpringApplication.run(SpringCloudZuulApplication.class, args);
	    log.info("spring-cloud-zuul-advanced启动!");
	}
	
	@Bean
	public AccessZuulFilter accessZuulFilter() {
		return new AccessZuulFilter();
	}
	
	@Bean
	public MyEurekaClientFallback eurekaClientFallback() {
		return new MyEurekaClientFallback();
	}
	
	@Bean
	@ConditionalOnProperty(name="zuul.SendErrorFilter.error.disable")
	public CustomErrorFilter customErrorFilter() {
		return new CustomErrorFilter();
	}
}
