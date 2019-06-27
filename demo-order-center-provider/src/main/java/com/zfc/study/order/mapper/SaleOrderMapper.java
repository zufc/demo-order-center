package com.zfc.study.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zfc.study.order.domain.entity.SaleOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SaleOrderMapper extends BaseMapper<SaleOrder> {
}
