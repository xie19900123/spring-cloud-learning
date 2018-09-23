package cn.lqdev.learning.springcloud.hystrix.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class HelloClientFallbackFactory implements FallbackFactory<IHelloClient>{

	@Autowired
	@Qualifier("fallback")
	IHelloClient helloClient;
	
	@Override
	public IHelloClient create(Throwable cause) {
		log.error("feign调用发生异常，触发熔断", cause);
		return helloClient;
	}

}
