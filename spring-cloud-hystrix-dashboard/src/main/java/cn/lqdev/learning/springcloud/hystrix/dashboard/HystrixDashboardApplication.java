package cn.lqdev.learning.springcloud.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableHystrixDashboard
@Slf4j
public class HystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardApplication.class, args);
		log.info("spring-cloud-hystrix-dashboard启动!");
	}
}
