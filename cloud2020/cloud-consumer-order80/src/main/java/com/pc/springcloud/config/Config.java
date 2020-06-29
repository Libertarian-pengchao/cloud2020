package com.pc.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：pengchao
 * @date ：2020-06-29
 */
@Configuration
public class Config {
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
