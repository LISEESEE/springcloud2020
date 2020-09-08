package com.codecat.springcloud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.codecat.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {
}
