package com.ayalamih.domain;

/**
 * com.ayalamih.domain
 *
 * @author ayalamih.
 * @date 3:47 PM, 05/03/2018
 * @contact 31007354@qq.com
 */
public class ArtExample {
    public static void main(String[] args) {
        /*
         * 得到一个实例对象对应的Class对象的方式 */

        // 1.通过实例变量的getClass()方法
        Art art = new Art();
        Class clazz = art.getClass();

        // 2.通过类Class的静态方法forName()
        try {
            Class claz = Class.forName("com.ayalamih.domain.Art");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 3.直接给出对象类文件的.class
        Class clz = Art.class;
    }
}
