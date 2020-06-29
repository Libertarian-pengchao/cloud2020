package com.pc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：pengchao
 * @date ：2020-06-29
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceMain7001 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceMain7001.class, args);
	}
}
