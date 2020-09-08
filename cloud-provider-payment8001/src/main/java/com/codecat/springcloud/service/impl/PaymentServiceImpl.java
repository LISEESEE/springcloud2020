package com.codecat.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.codecat.springcloud.mapper.PaymentMapper;
import com.codecat.springcloud.entities.Payment;
import com.codecat.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

@Service("paymentService")
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment> implements PaymentService {
}
