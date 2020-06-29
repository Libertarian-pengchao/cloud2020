package com.pc.springcloud.controller;

import com.pc.springcloud.entity.CommonResult;
import com.pc.springcloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：pengchao
 * @date ：2020-06-29
 */
@RestController
public class OrderController {

	@Autowired
	private RestTemplate restTemplate;

	private static final String PAYMENT_URL = "http://localhost:8001";

	@PostMapping("/consumer/payment/create")
	public CommonResult createPayment(@RequestBody Payment payment){
		return restTemplate.getForObject(PAYMENT_URL + "/payment/create", CommonResult.class);
	}

	@GetMapping("/consumer/payment/get/{id}")
	public CommonResult getPaymentById(@PathVariable Long id){
		return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
	}
}
