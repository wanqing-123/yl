package com.ayalamih.design.abstractfactory;

/**
 * com.ayalamih.design.abstractfactory
 *
 * @author ayalamih.
 * @date 9:46 PM, 2018/4/8
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框");
    }
}
