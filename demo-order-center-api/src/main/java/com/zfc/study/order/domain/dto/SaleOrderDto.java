package com.zfc.study.order.domain.dto;

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
public class SaleOrderDto implements Serializable {
    private static final long serialVersionUID = -4662004717451292685L;

    private String id;

    private String orderId;

    private String orderName;

    private Date createAt;


}
