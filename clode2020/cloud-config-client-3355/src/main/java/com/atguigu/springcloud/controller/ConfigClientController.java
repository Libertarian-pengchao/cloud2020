package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：pengchao
 * @date ：2022-07-24
 */
@RestController
@RefreshScope
public class ConfigClientController {
	@Value("${feign.hystrix.enabled}")
	private String hystrixEnabled;

	@GetMapping("/configInfo")
	public String getConfigInfo() {
		return hystrixEnabled;
	}

}
