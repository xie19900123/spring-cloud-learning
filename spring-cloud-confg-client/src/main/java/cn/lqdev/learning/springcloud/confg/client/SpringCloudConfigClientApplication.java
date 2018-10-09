package cn.lqdev.learning.springcloud.confg.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * Spring Cloud Config client 示例
 * @author oKong
 *
 */
@SpringBootApplication
@Slf4j
public class SpringCloudConfigClientApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
		log.info("spring-cloud-config-client启动!");
	}

}
