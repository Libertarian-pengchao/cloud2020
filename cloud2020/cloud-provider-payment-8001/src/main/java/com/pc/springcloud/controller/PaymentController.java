package com.pc.springcloud.controller;

import com.pc.springcloud.entity.CommonResult;
import com.pc.springcloud.entity.Payment;
import com.pc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：pengchao
 * @date ：2020-06-29
 */
@RestController
@Slf4j
public class PaymentController {
	@Autowired
	private PaymentService paymentService;

	@PostMapping(value="/payment/create")
	public CommonResult<Integer> create(Payment payment){
		int result = paymentService.create(payment);
		log.info("*******  插入结果：" + result);
		if (result > 0) {
			return new CommonResult(200,"插入成功！",result);
		}
		return new CommonResult(500,"插入失败！");
	}

	@GetMapping(value="/payment/get/{id}")
	public CommonResult<Payment> getPaymentByid(@PathVariable("id") Long id){
		Payment payment = paymentService.getPaymentById(id);
		log.info("*******  查询结果：" + payment);
		if (null != payment) {
			return new CommonResult(200,"查询成功！").setData(payment);
		}
		return new CommonResult(500,"查询失败！");
	}
}
