package com.pc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：pengchao
 * @date ：2020-06-30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerZKMain80 {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerZKMain80.class, args);
	}
}
