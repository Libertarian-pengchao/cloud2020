package com.pc.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：pengchao
 * @date ：2020-06-30
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.pc.springcloud.dao")
public class ZookeeperMain8004 {
	public static void main(String[] args) {
		SpringApplication.run(ZookeeperMain8004.class, args);
	}
}
