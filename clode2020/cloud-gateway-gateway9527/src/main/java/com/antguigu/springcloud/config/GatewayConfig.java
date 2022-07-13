package com.antguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：pengchao
 * @date ：2022-06-26
 */
@Configuration
public class GatewayConfig {

	@Bean
	public RouteLocator custom(RouteLocatorBuilder builder){
		RouteLocatorBuilder.Builder routes = builder.routes();
		// http://news.baidu.com/guonei
		routes.route("path_route_antguigu", r -> r.path("/guonei").uri("http://news.baidu.com/guonei"));
		return routes.build();
	}
}
