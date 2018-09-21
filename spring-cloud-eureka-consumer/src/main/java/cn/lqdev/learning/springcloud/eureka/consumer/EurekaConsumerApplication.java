package cn.lqdev.learning.springcloud.eureka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class EurekaConsumerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaConsumerApplication.class, args);
		log.info("spring-cloud-eureka-consumer启动!");
	}
	
	@Bean 
	public RestTemplate restTemplate() { 
		return new RestTemplate(); 
	} 	
}
