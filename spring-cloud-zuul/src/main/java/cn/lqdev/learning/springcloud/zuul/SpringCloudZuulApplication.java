package cn.lqdev.learning.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import lombok.extern.slf4j.Slf4j;

/**
 * zuul 示例
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
		log.info("spring-cloud-zuul启动!");
	}

}
