package com.meetcity.payment.core.model.merchant;

import lombok.Data;

/**
 * Created by lenovo on 2017/9/7.
 */
@Data
public class TbWechatTrade {
    private Integer tradeId;
    private String tradeName;
    private String tradeType;
    private Integer tradeCode;
}
