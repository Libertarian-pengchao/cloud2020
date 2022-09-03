package com.atguigu.springcloud.service.Impl;

import com.atguigu.springcloud.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import java.util.UUID;

/**
 * @author ：pengchao
 * @date ：2022-08-27
 */
@EnableBinding(Source.class)
public class MessageServiceImpl implements IMessageService {

	@Autowired
	private MessageChannel output;

	@Override
	public String send() {
		String serial = UUID.randomUUID().toString();
		output.send(MessageBuilder.withPayload(serial).build());
		return serial;
	}
}
