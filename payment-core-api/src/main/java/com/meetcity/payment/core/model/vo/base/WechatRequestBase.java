package com.meetcity.payment.core.model.vo.base;


import com.meetcity.payment.core.model.vo.AbstractBase;

import java.util.Map;

/**
 * @author zhang.hui@pufubao.net
 * @version v1.0
 * @date 2016/11/2 17:02
 */
public abstract class WechatRequestBase extends AbstractBase {

    public abstract Map<String, Object> toMap();


}
