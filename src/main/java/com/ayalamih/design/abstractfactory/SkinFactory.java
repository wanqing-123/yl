package com.ayalamih.design.abstractfactory;

/**
 * com.ayalamih.design.abstractfactory
 * 界面皮肤工厂接口: 抽象工厂
 * @author ayalamih.
 * @date 9:51 PM, 2018/4/8
 */
public interface SkinFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
