import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class TestIn2 {
/*
发送的字符串示例：
{
    "accountName": "测试",
    "accountNo": "524btc8ec00=",
    "alipayT0Fee": "0.038",
    "alipayT1Fee": "0.0038",
    "alipayType": 1,
    "bankBranch": "北京银行朝阳支行",
    "bankCity": "北京市",
    "bankCode": "987655332",
    "bankName": "北京银行",
    "bankProv": "北京市",
    "bankType": "TOPRIVATE",
    "businessLicense": "CESHI00001",
    "channelName": "89346386567",
    "channelNo": "8934638656",
    "creditCardNo": "ihNYBXNrJRQ=",
    "installCity": "北京",
    "installCounty": "朝阳区",
    "installProvince": "北京",
    "legalPersonID": "123324324",
    "legalPersonName": "测试",
    "merchantBillName": "测试商户",
    "merchantName": "测试上户 4462",
    "merchantPersonEmail": "1@08220.1",
    "merchantPersonName": "测试",
    "merchantPersonPhone": "1234567",
    "merchantType": "ENTERPRISE",
    "operateAddress": "北京市朝阳区",
    "remarks": "1234567",
    "sign": "6CE27C4C2DC6410F65FE60B099FBDA76",
    "wxT0Fee": "0.038",
    "wxT1Fee": "0.0038",
    "wxType": 1
}

签名时去掉sign  就是签名前的json格式字符串。

------提醒： 和交易的参数排序和加密不太一样。*/

	public static void main(String[] args) throws Exception {
		String signkey = "123456789123456789123456";
		String desKey =  "123456789123456789123456";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("channelName", "8934638656");
		map.put("channelNo", "8934638656");
		map.put("merchantName", "测试上户 22");
		map.put("merchantBillName", "测试商户");
		map.put("installProvince", "北京");
		map.put("installCity", "北京");
		map.put("installCounty", "朝阳区");
		map.put("operateAddress", "北京市朝阳区");
		map.put("merchantType", "ENTERPRISE");
		
		map.put("businessLicense", "CESHI00001");
		
		map.put("legalPersonName", "测试");
		map.put("legalPersonID", "123324324");
		map.put("merchantPersonName", "测试");
		map.put("merchantPersonPhone", "1234567");
		
		map.put("merchantPersonEmail", "1@12.1");
		map.put("wxType", 1);
		map.put("wxT1Fee", "0.0038");
		map.put("wxT0Fee", "0.038");
		map.put("alipayType", 1);
		map.put("alipayT1Fee", "0.0038");
		map.put("alipayT0Fee", "0.038");
		map.put("bankType", "TOPRIVATE");
		map.put("accountName", "测试");
		String accno = new String(TripleDESUtil.encrypt( "123".getBytes(),desKey.getBytes()));
		map.put("accountNo", accno);
		
		map.put("bankName", "北京银行");
		map.put("bankProv", "北京市");
		map.put("bankCity", "北京市");
		map.put("bankBranch", "北京银行朝阳支行");
		map.put("bankCode", "987655332");
		String creditno =  new String(TripleDESUtil.encrypt( "456".getBytes(),desKey.getBytes()));
		map.put("creditCardNo", creditno);
		map.put("remarks", "1234567");
		
	    String sign = Md5Util.MD5(JSON.toJSONString(map)+signkey);
	    map.put("sign", sign);
		String url = "http://real.izhongyin.com/middlepayportal/merchant/in2";//查询地址 in 换成query
		
		String res = HttpClientUtil.getInstance().sendHttpPost(url, JSON.toJSONString(map));
		System.out.println("----"+res);
		JSONObject p = JSON.parseObject(res);
		System.out.println(p);
		String sign2 = (String) p.remove("sign");
		String md5 = Md5Util.MD5(p+signkey);
		System.out.println("验签结果："+sign2.equals(md5));
	}
}

