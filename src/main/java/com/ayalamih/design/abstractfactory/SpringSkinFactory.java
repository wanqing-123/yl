package com.ayalamih.design.abstractfactory;

/**
 * com.ayalamih.design.abstractfactory
 *
 * @author ayalamih.
 * @date 9:56 PM, 2018/4/8
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
