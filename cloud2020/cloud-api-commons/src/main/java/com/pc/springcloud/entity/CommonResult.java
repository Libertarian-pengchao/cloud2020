package com.pc.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author ：pengchao
 * @date ：2020-06-29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)	// 访问方式  chain=true 表示链式风格访问
public class CommonResult<T> {
	// 404 not fund
	private Integer code;
	private String message;
	private T data;
	public CommonResult(Integer code,String message){
		this(code,message,null);
	}
}
