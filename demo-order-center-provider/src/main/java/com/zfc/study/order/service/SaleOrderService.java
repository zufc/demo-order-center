package com.zfc.study.order.service;

import com.zfc.study.order.domain.vo.SaleOrderVo;

import java.util.List;

public interface SaleOrderService {

    List<SaleOrderVo> selectList();
}
