package com.ayalamih.model;

/**
 * com.ayalamih.model
 *
 * @author ayalamih.
 * @date 6:11 PM, 06/02/2018
 * @contact 31007354@qq.com
 */
public class Order {
    // 委托单号
    private long orderId;
    // 交易商id
    private String traderId;
    // 商品代码
    private String commodityCode;
    // 下单时间
    private long time;
    // 下单价格
    private double price;
    // 下单数量
    private int quantity;
    // 未成交数量
    private int remainedQuantity;
    // 买卖方向 true-买， false-卖
    private boolean buy;
    // 是否市价下单
    private boolean marketPrice;

    public Order(long orderId, String traderId, String commodityCode, long time, double price, int quantity,
                 int remainedQuantity, boolean isBuy, boolean isMarketPrice) {
        this.orderId = orderId;
        this.traderId = traderId;
        this.commodityCode = commodityCode;
        this.time = time;
        this.price = price;
        this.quantity = quantity;
        this.remainedQuantity = remainedQuantity;
    }

    public Order(String traderId, String commodityCode, long time, double price, int quantity,
                 int remainedQuantity, boolean isBuy, boolean isMarketPrice) {
        this.traderId = traderId;
        this.commodityCode = commodityCode;
        this.time = time;
        this.price = price;
        this.quantity = quantity;
        this.remainedQuantity = remainedQuantity;
        this.buy = isBuy;
        this.marketPrice = isMarketPrice;
    }

    public String getTraderId() {
        return traderId;
    }

    public String getCommodityCode() {
        return commodityCode;
    }

    public long getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getOrderId() {
        return orderId;
    }

    public int getRemainedQuantity() {
        return remainedQuantity;
    }

    public void setBuy(boolean buy) {
        this.buy = buy;
    }

    public boolean isBuy() {
        return buy;
    }

    public void setMarketPrice(boolean marketPrice) {
        this.marketPrice = marketPrice;
    }

    public boolean isMarketPrice() {
        return marketPrice;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((commodityCode == null) ? 0 : commodityCode.hashCode());
        result = prime * result + (buy ? 1231 : 1237);
        result = prime * result + (marketPrice ? 1231 : 1237);
        result = prime * result + (int) (orderId ^ (orderId >>> 32));
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + quantity;
        result = prime * result + remainedQuantity;
        result = prime * result + (int) (time ^ (time >>> 32));
        result = prime * result + ((traderId == null) ? 0 : traderId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (commodityCode == null) {
            if (other.commodityCode != null)
                return false;
        } else if (!commodityCode.equals(other.commodityCode))
            return false;
        if (buy != other.buy)
            return false;
        if (marketPrice != other.marketPrice)
            return false;
        if (orderId != other.orderId)
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (quantity != other.quantity)
            return false;
        if (remainedQuantity != other.remainedQuantity)
            return false;
        if (time != other.time)
            return false;
        if (traderId == null) {
            if (other.traderId != null)
                return false;
        } else if (!traderId.equals(other.traderId))
            return false;
        return true;
    }
}
