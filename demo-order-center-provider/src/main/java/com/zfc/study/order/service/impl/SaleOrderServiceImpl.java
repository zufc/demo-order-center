package com.zfc.study.order.service.impl;

import com.google.common.collect.Lists;
import com.zfc.study.order.domain.vo.SaleOrderVo;
import com.zfc.study.order.mapper.SaleOrderMapper;
import com.zfc.study.order.service.SaleOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

/**
 * @Author zufeichao
 * @ProjectName demo-order-center
 * @Description TODO
 * @Date 2019-06-26 20:07
 **/
@Service
@Slf4j
public class SaleOrderServiceImpl implements SaleOrderService {

    @Autowired
    private SaleOrderMapper saleOrderMapper;

    @Override
    public List<SaleOrderVo> selectList() {

        //List<SaleOrder> saleOrderList = saleOrderMapper.selectList();
        List<SaleOrderVo> list = Lists.newArrayList();
        SaleOrderVo saleOrderVo = new SaleOrderVo();
        saleOrderVo.setId("1");
        saleOrderVo.setOrderId("OMS123456789");
        saleOrderVo.setOrderName("华为P20");
        saleOrderVo.setCreateAt(new Date());
        list.add(saleOrderVo);
        return list;
    }
}
