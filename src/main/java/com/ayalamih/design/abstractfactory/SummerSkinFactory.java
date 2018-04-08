package com.ayalamih.design.abstractfactory;

/**
 * com.ayalamih.design.abstractfactory
 *
 * @author ayalamih.
 * @date 9:57 PM, 2018/4/8
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
