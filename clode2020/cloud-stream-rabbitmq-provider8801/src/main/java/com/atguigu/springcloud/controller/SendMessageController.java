package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：pengchao
 * @date ：2022-08-27
 */
@RestController
public class SendMessageController {

	@Autowired
	private IMessageService messageService;

	@GetMapping("/sendMessage")
	public String sendMessage(){
		return messageService.send();
	}
}
