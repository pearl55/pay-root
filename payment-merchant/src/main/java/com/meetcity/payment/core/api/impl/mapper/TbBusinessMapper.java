package com.meetcity.payment.core.api.impl.mapper;


import com.meetcity.payment.core.model.merchant.TbBusiness;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 业务类持久层
 * Created by admin on 2017/9/6.
 */
@Mapper
@Repository
public interface TbBusinessMapper {
    /**
     * 商户业务修改
     * @param tbBusiness
     */
    void updateTbBusiness(TbBusiness tbBusiness);

    /*
     * 添加开通业务数据信息
     */
    void insertTbBusiness(TbBusiness business);

}
