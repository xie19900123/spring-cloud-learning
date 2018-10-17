package cn.lqdev.learning.springcloud.zuul.config;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import lombok.extern.slf4j.Slf4j;

/**
 * 自定义过滤器-校验请求参数是否合法：包含token参数
 * @author oKong
 *
 */
@Slf4j
public class AccessZuulFilter extends ZuulFilter{

	@Override
	public boolean shouldFilter() {
		//此方法可以根据请求的url进行判断是否需要拦截
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		//获取请求的上下文类 注意是：com.netflix.zuul.context包下的
		RequestContext ctx = RequestContext.getCurrentContext();
		//获取request对象
		HttpServletRequest request = ctx.getRequest();
		//避免中文乱码
		ctx.addZuulResponseHeader("Content-type", "text/json;charset=UTF-8");
		ctx.getResponse().setCharacterEncoding("UTF-8");
		//打印日志
		log.info("请求方式：{},地址：{}", request.getMethod(),request.getRequestURI());
		String token = request.getParameter("token");
		if(StringUtils.isBlank(token)) {
			//使其不进行转发
		   ctx.setSendZuulResponse(false);
		   //这里可进行自定义提示
		   ctx.setResponseBody("{\"code\":\"999500\",\"msg\":\"非法访问\"}");
		   ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
		   //或者添加一个额外参数也可以 传递参数可以使用
//		   ctx.set("checkAuth",false);
		}
//		System.out.println(1/0);
		//这返回值没啥用 
		return null;
	}

	@Override
	public String filterType() {
		//前置过滤器
		return PRE_TYPE;
	}

	@Override
	public int filterOrder() {
		//执行顺序  0 靠前执行 在spring cloud zuul提供的pre过滤器之后执行，默认的是小于0的。	
		//除了参数校验类的过滤器 一般上直接放在 PreDecoration前
		//即：PRE_DECORATION_FILTER_ORDER - 1;
		//常量类都在：org.springframework.cloud.netflix.zuul.filters.support.FilterConstants 下
		return 0;
	}

}
