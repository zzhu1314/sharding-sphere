package com.cigit.dao;

import com.cigit.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author:zhuzhou
 * @Date: 2019/12/9  17:33
 **/
@Mapper
@Repository
public interface OrderMapper {

    /**
     * 插入订单信息，t_order为逻辑表名
     * @param order
     * @return
     */
    @Insert(value = "insert into t_order(order_no,user_id,order_amount,order_status,remark) " +
            " values(#{orderNo},#{userId},#{orderAmount},#{orderStatus},#{remark})")
     int addOrder(Order order);
}
