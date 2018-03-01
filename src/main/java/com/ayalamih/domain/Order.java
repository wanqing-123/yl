package com.ayalamih.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.ayalamih.common.DateTimeDeserializer;
import com.ayalamih.common.DateTimeSerializer;
import org.joda.time.DateTime;

/**
 * com.ayalamih.domain
 *
 * @author ayalamih.
 * @date 10:03 PM, 27/02/2018
 * @contact 31007354@qq.com
 */
public class Order {

    private String orderSn;

    @JSONField(serializeUsing = DateTimeSerializer.class,
        deserializeUsing = DateTimeDeserializer.class)
    private DateTime createTime;

    @JSONField(serializeUsing = DateTimeSerializer.class,
            deserializeUsing = DateTimeDeserializer.class)
    private DateTime finishTime;

    private Double price;

    public Order() {
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public DateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(DateTime createTime) {
        this.createTime = createTime;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setFinishTime(DateTime finishTime) {
        this.finishTime = finishTime;
    }

    public DateTime getFinishTime() {
        return finishTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderSn='" + orderSn + '\'' +
                ", createTime=" + createTime +
                ", price=" + price +
                '}';
    }
}
