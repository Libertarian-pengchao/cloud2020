package com.pc.springcloud.dao;

import com.pc.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author ：pengchao
 * @date ：2020-06-29
 */
public interface PaymentDao {
	@Insert(value="insert into payment(serial) values(#{serial})")
	@Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id") //该注解用于返回主键
	public int create(Payment payment);

	@Select("select * from payment where id=#{id}")
	public Payment getPaymentById(@Param("id") Long id);
}
