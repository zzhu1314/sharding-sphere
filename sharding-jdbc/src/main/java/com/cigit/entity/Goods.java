package com.cigit.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.core.annotation.Order;

/**
 * @Author:zhuzhou
 * @Date: 2019/12/10  14:37
 **/
@Data
@Builder
public class Goods {
    private Long goodsId;
    private String goodsName;
    private Long goodsType;
}
