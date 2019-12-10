package com.cigit.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author:zhuzhou
 * @Date: 2019/12/9  17:30
 **/
@Data
@Builder
public class Order {
    private Long orderId;
    private String orderNo;
    private Long userId;
    private BigDecimal orderAmount;
    private Integer orderStatus;
    private String remark;


}
