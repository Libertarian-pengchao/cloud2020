package com.pc.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ：pengchao
 * @date ：2020-06-29
 */

@SpringBootApplication
@MapperScan(basePackages = "com.pc.springcloud.dao")
@EnableEurekaClient
public class Payment8001 {
	public static void main(String[] args) {
		SpringApplication.run(Payment8001.class, args);
	}
}
