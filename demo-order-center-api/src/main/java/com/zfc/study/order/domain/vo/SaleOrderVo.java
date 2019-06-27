package com.zfc.study.order.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author zufeichao
 * @ProjectName demo-order-center
 * @Description TODO
 * @Date 2019-06-26 20:00
 **/
@Data
public class SaleOrderVo implements Serializable {

    private static final long serialVersionUID = 1893143360563466632L;
    private String id;

    private String orderId;

    private String orderName;

    private Date createAt;


}
