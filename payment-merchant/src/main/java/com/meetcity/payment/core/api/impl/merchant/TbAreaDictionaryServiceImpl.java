package com.meetcity.payment.core.api.impl.merchant;


import com.meetcity.payment.core.api.impl.mapper.TbAreaDictionaryMapper;
import com.meetcity.payment.core.api.merchant.TbAreaDictionaryService;
import com.meetcity.payment.core.model.merchant.TbAreaDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by admin on 2017/9/11.
 */
@Service
public class TbAreaDictionaryServiceImpl implements TbAreaDictionaryService {
    @Autowired
    private TbAreaDictionaryMapper tbAreaDictionaryMapper;

    @Override
    public List<TbAreaDictionary> findByareaId() {
        return tbAreaDictionaryMapper.findByareaId(1);
    }



    public List<TbAreaDictionary> findByAreaOde(String areaCode) {
        return tbAreaDictionaryMapper.findByAreaOde(areaCode);
    }

    @Override
    public List<TbAreaDictionary> findByUpAreaName(String upAreaName) {
        return tbAreaDictionaryMapper.findByUpAreaName(upAreaName);
    }
}
