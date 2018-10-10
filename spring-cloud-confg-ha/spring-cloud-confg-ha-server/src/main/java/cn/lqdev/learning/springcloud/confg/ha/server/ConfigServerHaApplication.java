package cn.lqdev.learning.springcloud.confg.ha.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

/**
 * config server 服务化
 * 
 * @author oKong
 *
 */
@SpringBootApplication
@EnableConfigServer
//注意这里也可使用@EnableEurekaClient
//但由于springcloud是灵活的，注册中心支持eureka、consul、zookeeper等
//若写了具体的注册中心注解，则当替换成其他注册中心时，又需要替换成对应的注解了。
//所以 直接使用@EnableDiscoveryClient 启动发现。
//这样在替换注册中心时，只需要替换相关依赖即可。
@EnableDiscoveryClient
@Slf4j
public class ConfigServerHaApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConfigServerHaApplication.class, args);
		log.info("spring-cloud-config-ha-server启动!");
	}
}
