package com.ayalamih.design.abstractfactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * com.ayalamih.design.abstractfactory
 *
 * @author ayalamih.
 * @date 9:59 PM, 2018/4/8
 */
public class Client {
    public static void main(String[] args) {
        InputStream in = null;
        try {
            in = Client.class.getClassLoader().getResourceAsStream("config.properties");
            Properties props = new Properties();
            props.load(in);
            String skinFactoryIns = props.getProperty("skinFactory");
            SkinFactory skinFactory = (SkinFactory) Class.forName(skinFactoryIns).newInstance();
            Button button = skinFactory.createButton();
            TextField textField = skinFactory.createTextField();
            ComboBox comboBox = skinFactory.createComboBox();

            button.display();
            textField.display();
            comboBox.display();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
