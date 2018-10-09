package cn.lqdev.learning.sringcloud.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import lombok.extern.slf4j.Slf4j;

/** 
*
* @ClassName   类名：SpringCloudConfigServerApplication 
* @Description 功能说明：
* <p>
* TODO
*</p>
************************************************************************
* @date        创建日期：2018年10月9日
* @author      创建人：oKong
* @version     版本号：V1.0
*<p>
***************************修订记录*************************************
* 
*   2018年10月9日   xds   创建该类功能。
*
***********************************************************************
*</p>
*/
@SpringBootApplication
@EnableConfigServer
@Slf4j
public class SpringCloudConfigServerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
		log.info("spring-cloud-config-server启动!");
	}
}
