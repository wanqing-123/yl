package com.ayalamih.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * com.ayalamih.domain
 *
 * @author ayalamih.
 * @date 4:02 PM, 05/03/2018
 * @contact 31007354@qq.com
 */
public class Cat {
    public static int count;
    public int age;
    private String name;

    static {
        count = 0;
    }

    public Cat() {
        this.age = count++;
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + "this is class Cat!");
    }

    public void run() {
    }

    private void ruff() {
    }

    public String getName() {
        return name;
    }
}
