package com.ayalamih.design.abstractfactory;

/**
 * com.ayalamih.design.abstractfactory
 * 具体产品
 * @author ayalamih.
 * @date 9:44 PM, 2018/4/8
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示蓝色按钮");
    }
}
