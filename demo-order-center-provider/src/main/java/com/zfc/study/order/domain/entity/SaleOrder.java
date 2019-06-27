package com.zfc.study.order.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author zufeichao
 * @ProjectName demo-order-center
 * @Description TODO
 * @Date 2019-06-26 20:04
 **/
@Data
public class SaleOrder implements Serializable {
    private static final long serialVersionUID = 6244907178866001146L;
    private String id;

    private String orderId;

    private String orderName;

    private Date createAt;
}
