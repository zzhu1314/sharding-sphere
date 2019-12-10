package com.cigit.dao;

import com.cigit.entity.Goods;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author:zhuzhou
 * @Date: 2019/12/10  14:39
 **/
@Mapper
@Repository
public interface GoodsMapper {
    @Insert(value = "insert into goods(goods_id,goods_name,goods_type) " +
            "values(#{goodsId},#{goodsName},#{goodsType})")
    void add(Goods goods);
}
