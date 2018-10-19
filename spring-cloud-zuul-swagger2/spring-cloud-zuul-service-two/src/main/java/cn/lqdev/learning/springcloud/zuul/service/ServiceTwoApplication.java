package cn.lqdev.learning.springcloud.zuul.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

/**
 * api服务示例
 * @author oKong
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class ServiceTwoApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServiceTwoApplication.class, args);
		log.info("spring-cloud-zuul-service-two启动!");
	}
}
