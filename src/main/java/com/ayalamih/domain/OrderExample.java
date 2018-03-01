package com.ayalamih.domain;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.IOUtils;
import org.joda.time.DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * com.ayalamih.domain
 *
 * @author ayalamih.
 * @date 10:06 PM, 27/02/2018
 * @contact 31007354@qq.com
 */
public class OrderExample {

    public static void main(String[] args) {
        String orderJson = "{" +
                "\"orderSn\": \"P1519738721\", " +
                "\"createTime\":1519738730587, " +
                "\"price\": 20.09, " +
                "\"finishTime\":1519741432977}";

        Order order = JSON.parseObject(orderJson, Order.class);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + order);
        System.out.println("\r\n");
        DateTime dateTime = new DateTime();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + dateTime);
    }
}
