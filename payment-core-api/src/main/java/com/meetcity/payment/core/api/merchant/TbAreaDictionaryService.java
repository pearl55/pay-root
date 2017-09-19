package com.meetcity.payment.core.api.merchant;


import com.meetcity.payment.core.model.merchant.TbAreaDictionary;

import java.util.List;

/**
 * 地址业务层
 * Created by admin on 2017/9/11.
 */
public interface TbAreaDictionaryService {
    /**
     * 查询所有的省
     * @return
     */
    List<TbAreaDictionary> findByareaId();

    /**
     * 根据省查询市
     * @param areaCode
     * @return
     */
    List<TbAreaDictionary> findByAreaOde(String areaCode);

    /**
     * 根据省名称查询市
     * @param upAreaName
     * @return
     */
    List<TbAreaDictionary> findByUpAreaName(String upAreaName);
}
