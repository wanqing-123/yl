package com.ayalamih.example;

/**
 * com.ayalamih.example
 *
 * @author ayalamih.
 * @date 5:00 PM, 07/02/2018
 * @contact 31007354@qq.com
 */
public class StaticExample {
    static {
        System.out.println("静态块");
    }

    public static void main(String[] args) {
        StaticExample.test1();
        StaticExample.test1();
    }

    private static void test1() {
        System.out.println("test1");
    }
}
