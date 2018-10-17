package cn.lqdev.learning.springcloud.zuul.config;

import javax.servlet.http.HttpServletResponse;

import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;
import org.springframework.util.ReflectionUtils;

import com.netflix.zuul.context.RequestContext;

import lombok.extern.slf4j.Slf4j;

/**
 * 自定义异常类 过滤器 直接扩展 SendErrorFilter 类
 * @author oKong
 *
 */
@Slf4j
public class CustomErrorFilter extends SendErrorFilter{

	@Override
	public Object run() {
		//重写 run方法		
		try{
			RequestContext ctx = RequestContext.getCurrentContext();
			//直接复用异常处理类
			ExceptionHolder exception = findZuulException(ctx.getThrowable());
			log.info("异常信息:{}", exception.getErrorCause());
			//这里可对不同异常返回不同的错误码
			HttpServletResponse response = ctx.getResponse();
			response.getOutputStream().write(("{\"code\":\"999999\",\"msg\":\"" + exception.getErrorCause() + "\"}").getBytes());
            	 
		}catch (Exception ex) {
			ReflectionUtils.rethrowRuntimeException(ex);
		}
		return null;
	}

}
