package com.atguigu.spring.controller;

import com.atguigu.spring.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：pengchao
 * @date ：2021-12-30
 */
@RestController
@Slf4j
public class PaymentController {
	@Resource
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;


	@GetMapping("/payment/hystrix/ok/{id}")
	public String paymentInfo_OK(@PathVariable("id") Integer id) {
		String result = paymentService.paymentInfo(id);
		log.info("****result:" + result);
		return result;
	}


	@GetMapping("/payment/hystrix/timeout/{id}")
	public String paymentInfo_TimeOut(@PathVariable("id") Integer id) throws InterruptedException {
		String result = paymentService.timeOut(id);
		log.info("****result:" + result);
		return result;
	}

	@GetMapping("/payment/circuit/{id}")
	public String paymentCircuitBreaker(@PathVariable("id") Integer id) {
		String result = paymentService.paymentCircuitBreaker(id);
		log.info("****result: " + result);
		return result;
	}
}
