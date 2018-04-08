package com.ayalamih.design.abstractfactory;

/**
 * com.ayalamih.design.abstractfactory
 *
 * @author ayalamih.
 * @date 9:45 PM, 2018/4/8
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框");
    }
}
