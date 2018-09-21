package cn.lqdev.learning.springcloud.eureka.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@Slf4j
public class EurekaConsumerFeignApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaConsumerFeignApplication.class, args);
		log.info("spring-cloud-eureka-consumer-feign启动");
	}

}
