package com.ayalamih.example;

import com.google.common.base.Strings;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Collections2;
import com.google.common.collect.Comparators;
import com.google.common.collect.Lists;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.PropertyUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * com.ayalamih.example
 *
 * @author ayalamih.
 * @date 11:37 AM, 05/03/2018
 * @contact 31007354@qq.com
 */
public class MemorySizeExample {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        List<String> list = new ArrayList<>(4);
        list.add("http://www.ayalamih.com");
        System.out.println(list.getClass());

        User user = new User();
        user.setName("ayalamih");
        user.setEnabled(false);
        user.setId("1");
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + "user: " + user.toString());
        Class clz = User.class;
        List<Field> fields = new ArrayList<>(4);
        while (clz != null && !clz.getName().toLowerCase().equals("java.lang.object")) {
            fields.addAll(Arrays.asList(clz.getDeclaredFields()));
            clz = clz.getSuperclass();
        }
//        Field.setAccessible(, true);
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + ", " + field.get(user));
        }

        Class clazz = User.class;
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + "clazz: " + clazz.getName());

        if (boolean.class == Boolean.TYPE) {
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                    + " INFO "
                    + "[" + Thread.currentThread().getName() + "] "
                    + "boolean");
        } else {
            System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                    + " ERROR "
                    + "[" + Thread.currentThread().getName() + "] "
                    + "boolean error");
        }

    }
}

class User extends Person {
    User() {}
    private String name;
    private boolean enabled;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", enabled=" + enabled +
                '}';
    }
}

class Person {
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
