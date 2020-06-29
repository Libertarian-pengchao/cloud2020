package com.pc.springcloud.service.impl;

import com.pc.springcloud.dao.PaymentDao;
import com.pc.springcloud.entity.Payment;
import com.pc.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：pengchao
 * @date ：2020-06-29
 */
@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentDao paymentDao;

	@Override
	public int create(Payment payment) {
		return paymentDao.create(payment);
	}

	@Override
	public Payment getPaymentById(Long id) {
		return paymentDao.getPaymentById(id);
	}
}
