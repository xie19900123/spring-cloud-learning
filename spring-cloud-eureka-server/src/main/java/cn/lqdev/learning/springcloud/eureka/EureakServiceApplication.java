package cn.lqdev.learning.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

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
	
	/**
	 * 忽略此路径下的CSRF令牌
	 * @author oKong
	 *
	 */
	@EnableWebSecurity
	static class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().ignoringAntMatchers("/eureka/**");
			super.configure(http);
		}
	}	
}
