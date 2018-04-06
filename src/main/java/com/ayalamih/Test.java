package com.ayalamih;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * com.ayalamih
 *
 * @author ayalamih.
 * @date 11:14 PM, 17/03/2018
 */
public class Test {
    public static void main(String[] args) {
        Map callback = new HashMap();
        callback.put("data", "{\"fee\":\"46\",\"mac\":\"33373145\",\"merchantNo\":\"683453865203231\",\"mobile\":\"13051494702\",\"orgSendSeqId\":\"1803172358479491287\",\"organizationId\":\"283643805\",\"payDesc\":\"????\",\"payResult\":\"00\",\"sysOrderId\":\"20180318000434FVxOX71dgxr\",\"transAmt\":\"830\"}");
        System.out.println(formRequestMap(callback));
        /*Map map = JSON.parseObject(callback.get("data").toString(), Map.class);
        System.out.println(map.get("fee"));
        System.out.println(new BigDecimal("100.50").multiply(new BigDecimal("100")).compareTo(new BigDecimal("10050")));*/
    }

    public static Map formRequestMap(Map requestParams) {
        Map params = null;
        if (requestParams != null && requestParams.size() > 0) {
            params = new HashMap();
            String name = "";
            String[] values = null;
            for (Iterator iter = requestParams.keySet().iterator(); iter.hasNext(); ) {
                name = (String) iter.next();
                values = (String[]) requestParams.get(name);
                String valueStr = "";
                for (int i = 0; i < values.length; i++) {
                    valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
                }
                //乱码解决，这段代码在出现乱码时使用。如果mysign和sign不相等也可以使用这段代码转化
                params.put(name, valueStr);
            }
        }
        return params;
    }
}
