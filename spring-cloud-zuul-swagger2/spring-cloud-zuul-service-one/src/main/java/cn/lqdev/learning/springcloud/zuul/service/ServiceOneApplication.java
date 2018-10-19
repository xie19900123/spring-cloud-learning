package cn.lqdev.learning.springcloud.zuul.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

/**
 * api服务1 示例
 * @author oKong
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class ServiceOneApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServiceOneApplication.class, args);
		log.info("spring-cloud-zuul-service-one启动!");
	}
}
