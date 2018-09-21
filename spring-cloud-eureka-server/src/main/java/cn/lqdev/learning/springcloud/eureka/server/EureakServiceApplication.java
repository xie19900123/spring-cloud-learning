package cn.lqdev.learning.springcloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

/**
 * Eureka服务端
 * @author oKong
 *
 */
@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EureakServiceApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EureakServiceApplication.class, args);
		log.info("spring-cloud-eureka-service启动!");
	}
}