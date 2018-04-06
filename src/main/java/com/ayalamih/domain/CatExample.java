package com.ayalamih.domain;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * com.ayalamih.domain
 *
 * @author ayalamih.
 * @date 4:05 PM, 05/03/2018
 * @contact 31007354@qq.com
 */
public class CatExample {
    public static void main(String[] args) {
        Class clz = Cat.class;

        // 字段信息
        Field[] fields = clz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("\r\n===============================================================================\r\n");
        // 方法信息
        Method[] methods = clz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        try {
            Cat cat = (Cat) clz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        try {
            Class catClz1 = Class.forName("com.ayalamih.domain.Cat");
            Field fieldName = catClz1.getDeclaredField("name");
            fieldName.setAccessible(true);
            Cat catClz2 = (Cat) catClz1.newInstance();
            fieldName.set(catClz2, "tina");
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                    + " INFO "
                    + "[" + Thread.currentThread().getName() + "] "
                    + "name: " + catClz2.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
