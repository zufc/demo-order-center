package com.zfc.study.order.rpc.saleOrder;

import com.zfc.study.order.domain.vo.SaleOrderVo;
import com.zfc.study.order.service.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author zufeichao
 * @ProjectName demo-order-center
 * @Description TODO
 * @Date 2019-06-26 20:20
 **/
@RestController
@RequestMapping("/api/v1/saleOrder")
public class SaleOrderRpcServiceImpl {

    @Autowired
    private SaleOrderService saleOrderService;

    @GetMapping("/queryList")
    public List<SaleOrderVo> querySaleOrderList(){
        return saleOrderService.selectList();
    }

}
