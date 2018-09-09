package cn.lqdev.learning.eureka.service.ha;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@SpringCloudApplication
@EnableDiscoveryClient
@Slf4j
public class EurekaServiceHaApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaServiceHaApplication.class, args);
		log.info("spring-cloud-eureka-server-ha-test启动!");
	}
	
	//加入负载均衡能力
	//同时可根据applicationName 来访问服务
	//如http://EUREKA-CLIENT/add
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
