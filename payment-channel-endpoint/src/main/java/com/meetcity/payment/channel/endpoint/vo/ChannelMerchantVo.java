package com.meetcity.payment.channel.endpoint.vo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Getter
@Setter
public class ChannelMerchantVo {
    /*
    代理商ID
     */
    @NotBlank(message = "代理商ID为空")
    private String agentId;

    /*
    商户名称
     */
    @NotBlank(message = "商户名称为空")
    private String merchantName;
    /*
    经营名称
     */
    @NotBlank(message = "经营名称为空")
    private String merchantBizName;

    /*
    内部商户号
     */
    @NotBlank(message = "内部商户号为空")
    private String merchantId;

    /*
    法人身份证
     */
    @NotBlank(message = "法人身份证为空")
    private String legalId;
    /*
    法人姓名
     */
    @NotBlank(message = "法人姓名为空")
    private String legalName;

    /*
    联系人
     */
    @NotBlank(message = "联系人为空")
    private String contact;
    /*
    联系人电话
     */
    @NotBlank(message = "联系人电话为空")
    private String contactPhone;

    /*
    联系人邮箱
     */
    @Email(message = "联系人邮箱不符合规则")
    private String contactEmail;

    /*
    客服电话
     */
    @NotBlank(message = "客服电话为空")
    private String servicePhone;


    /*
    支付宝必传
     */
    private String businessAddress;
    private String provinceName;
    private String cityName;
    private String districtName;
    /*
    注册地址 企业商户必填
     */
    private String address;
    /*
    营业执照 企业商户必填
     */
    private String licenseNo;

    /*
    支付通道 WX 或者 Alipay
     */
    @NotBlank(message = "支付通道WechatPay或者Alipay")
    private String payChannel;

    /*
    费率
     */
    @NotBlank(message = "费率为空")
    private String rate;
    /*
    是否开通T+0
     */
    @NotBlank(message = "是否开通T+0 Y或者N")
    private String t0Status;

    /*
    t0 费率
     */
    private String t0Rate;
    /*
    t0加收费用
     */
    private String t0Extra;

    /*
    是否封顶
     */
    @NotBlank(message = "是否封顶 Y或者N")
    private String isCapped;

    /*
    封顶值
     */
    private String upperFee;


    /*
    结算模式
     */
    @NotBlank(message = "结算模式 T0_HANDING或T1_AUTO")
    private String settleMode;

    /*
    银行卡账户类型	个体户：PERSONAL 公户：COMPANY
     */
    @NotBlank(message = "银行卡账户类型 个体户：PERSONAL 公户：COMPANY")
    private String accountType;

    @NotBlank(message = "账户名为空")
    private String accountName;
    @NotBlank(message = "卡号为空")
    private String bankCard;
    @NotBlank(message = "银行名称为空")
    private String bankName;
    @NotBlank(message = "银行所在省为空")
    private String province;
    @NotBlank(message = "银行所在市为空")
    private String city;
    @NotBlank(message = "支行名称为空")
    private String bankSubName;
    @NotBlank(message = "联行号为空")
    private String alliedBankNo;

    @NotBlank(message = "签名为空")
    private String sign;


}
