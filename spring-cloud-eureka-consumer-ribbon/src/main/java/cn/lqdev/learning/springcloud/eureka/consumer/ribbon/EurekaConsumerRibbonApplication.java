package cn.lqdev.learning.springcloud.eureka.consumer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class EurekaConsumerRibbonApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaConsumerRibbonApplication.class, args);
		log.info("spring-cloud-eureka-consumer-ribbon启动!");
	}
	
	//添加 @LoadBalanced 使其具备了使用LoadBalancerClient 进行负载均衡的能力
	@Bean("balanedRestTemplate")
	@LoadBalanced
	public RestTemplate restTemplage() {
		return new RestTemplate();
	}
	
	//正常调用http服务时的 RestTemplate
	@Bean("normalRestTemplage")
	public RestTemplate normalRestTemplage() {
		return new RestTemplate();
	}
	
}
