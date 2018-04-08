package com.ayalamih.design.abstractfactory;

/**
 * com.ayalamih.design.abstractfactory
 * 具体产品
 * @author ayalamih.
 * @date 9:29 PM, 2018/4/6
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮");
    }
}
