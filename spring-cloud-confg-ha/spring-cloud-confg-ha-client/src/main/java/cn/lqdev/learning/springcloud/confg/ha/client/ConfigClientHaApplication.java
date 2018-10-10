package cn.lqdev.learning.springcloud.confg.ha.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

/**
 * 服务化方式调用config server
 * 
 * @author oKong
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class ConfigClientHaApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigClientHaApplication.class, args);
		log.info("spring-cloud-config-ha-client启动!");
	}

}
