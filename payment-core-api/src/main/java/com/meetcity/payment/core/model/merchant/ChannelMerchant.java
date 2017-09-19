package com.meetcity.payment.core.model.merchant;

import java.io.Serializable;

public class ChannelMerchant implements Serializable {

    /*
    代理商ID
     */
    private String agentId;

    /*
    商户名称
     */
    private String merchantName;
    /*
    经营名称
     */
    private String merchantBizName;

    /*
    系统商户号
     */
    private String merchantId;

    /*
    通道方商户号
     */
    private String channelMerchantId;

    /*
    法人身份证
     */
    private String legalId;
    /*
    法人姓名
     */
    private String legalName;

    /*
    联系人
     */
    private String contact;
    /*
    联系人电话
     */
    private String contactPhone;

    /*
    联系人邮箱
     */
    private String contactEmail;

    /*
    客服电话
     */
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
    private String payChannel;

    /*
    费率
     */
    private double rate;
    /*
    是否开通T+0
     */
    private String t0Status;

    /*
    t0 费率
     */
    private double t0Rate;
    /*
    t0加收费用
     */
    private double t0Extra;

    /*
    是否封顶
     */
    private String isCapped;

    /*
    封顶值
     */
    private double upperFee;


    /*
    结算模式
     */
    private String settleMode;

    /*
    银行卡账户类型	个体户：PERSONAL 公户：COMPANY
     */
    private String accountType;

    private String accountName;
    private String bankCard;
    private String bankName;
    private String province;
    private String city;
    private String bankSubName;
    private String alliedBankNo;


    private int merchantStatus;
    private String apiKey;

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantBizName() {
        return merchantBizName;
    }

    public void setMerchantBizName(String merchantBizName) {
        this.merchantBizName = merchantBizName;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getChannelMerchantId() {
        return channelMerchantId;
    }

    public void setChannelMerchantId(String channelMerchantId) {
        this.channelMerchantId = channelMerchantId;
    }

    public String getLegalId() {
        return legalId;
    }

    public void setLegalId(String legalId) {
        this.legalId = legalId;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getT0Status() {
        return t0Status;
    }

    public void setT0Status(String t0Status) {
        this.t0Status = t0Status;
    }

    public double getT0Rate() {
        return t0Rate;
    }

    public void setT0Rate(double t0Rate) {
        this.t0Rate = t0Rate;
    }

    public double getT0Extra() {
        return t0Extra;
    }

    public void setT0Extra(double t0Extra) {
        this.t0Extra = t0Extra;
    }

    public String getIsCapped() {
        return isCapped;
    }

    public void setIsCapped(String isCapped) {
        this.isCapped = isCapped;
    }

    public double getUpperFee() {
        return upperFee;
    }

    public void setUpperFee(double upperFee) {
        this.upperFee = upperFee;
    }

    public String getSettleMode() {
        return settleMode;
    }

    public void setSettleMode(String settleMode) {
        this.settleMode = settleMode;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBankSubName() {
        return bankSubName;
    }

    public void setBankSubName(String bankSubName) {
        this.bankSubName = bankSubName;
    }

    public String getAlliedBankNo() {
        return alliedBankNo;
    }

    public void setAlliedBankNo(String alliedBankNo) {
        this.alliedBankNo = alliedBankNo;
    }

    public int getMerchantStatus() {
        return merchantStatus;
    }

    public void setMerchantStatus(int merchantStatus) {
        this.merchantStatus = merchantStatus;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
