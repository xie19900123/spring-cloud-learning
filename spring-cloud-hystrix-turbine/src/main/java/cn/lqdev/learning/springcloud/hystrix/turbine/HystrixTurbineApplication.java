package cn.lqdev.learning.springcloud.hystrix.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

import lombok.extern.slf4j.Slf4j;

/**
 * turbine服务示例
 * @author oKong
 *
 */
@SpringBootApplication
@EnableTurbine
@EnableDiscoveryClient
@Slf4j
public class HystrixTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixTurbineApplication.class, args);
		log.info("spring-cloud-hystrix-turbine启动!");
	}
}
