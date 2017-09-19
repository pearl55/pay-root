/**   
* @Title: AliPayScannedRequestBase.java 
* @Package com.brcb.vo.base 
* @Description: TODO
* @author 朱梦光
* @date 2017年9月12日 上午11:25:59 
* @version V1.0   
*/
package com.meetcity.payment.core.model.vo.base;


import com.meetcity.payment.core.model.vo.AbstractBase;

import java.util.Map;


public abstract class AliPayScannedRequestBase extends AbstractBase {

	public abstract Map<String, Object> toMap();
}
