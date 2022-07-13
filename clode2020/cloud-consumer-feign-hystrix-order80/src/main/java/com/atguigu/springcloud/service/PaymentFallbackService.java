package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author ：pengchao
 * @date ：2022-01-16
 */
@Component
public class PaymentFallbackService implements  PaymentHystrixService{
	@Override
	public String paymentInfo_OK(Integer id) {
		return "PaymentFallbackService paymentInfo_OK";
	}

	@Override
	public String paymentInfo_TimeOut(Integer id) {
		return "PaymentFallbackService paymentInfo_TimeOut";
	}
}
