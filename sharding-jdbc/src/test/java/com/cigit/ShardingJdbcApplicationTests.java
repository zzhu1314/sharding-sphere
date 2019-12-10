package com.cigit;

import com.cigit.dao.GoodsMapper;
import com.cigit.dao.OrderMapper;
import com.cigit.entity.Goods;
import com.cigit.entity.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ShardingJdbcApplicationTests {

    @Autowired
    OrderMapper orderMapper;
    @Autowired
    GoodsMapper goodsMapper;
    @Test
    public  void contextLoads() {
        Order order1= Order.builder().orderNo("111").userId(1l).orderAmount(new BigDecimal(12))
                .orderStatus(1).remark("备注").build();
            Order order2 = Order.builder().orderNo("111").userId(2l).orderAmount(new BigDecimal(12))
                    .orderStatus(1).remark("备注").build();
            orderMapper.addOrder(order1);
            orderMapper.addOrder(order2);

    }

    @Test
    public void test(){
        Goods g = Goods.builder().goodsId(1l).goodsName("苹果").goodsType(2l).build();
        goodsMapper.add(g);
    }

}
