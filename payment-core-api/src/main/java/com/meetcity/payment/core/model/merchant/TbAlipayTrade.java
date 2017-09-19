package com.meetcity.payment.core.model.merchant;

import lombok.Data;

/**
 * 支付宝行业类型
 * Created by lenovo on 2017/9/8.
 */
@Data
public class TbAlipayTrade {
    private Integer alipayId;
    private String firstId;
    private String firstType;
}
