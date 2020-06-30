package com.pc.springcloud.service;

import com.pc.springcloud.entity.Payment;

/**
 * @author ：pengchao
 * @date ：2020-06-29
 */
public interface PaymentService {
	public int create(Payment payment);

	public Payment getPaymentById(Long id);
}
