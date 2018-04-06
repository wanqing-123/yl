package com.ayalamih.enums;

/**
 * com.ayalamih.enums
 *
 * @author ayalamih.
 * @date 3:31 PM, 07/03/2018
 * @contact 31007354@qq.com
 */
public class GenderEnumExample {
    public static void main(String[] args) {
        System.out.println(GenderEnum.get(0));
        StringToGenderEnumConverter converter = new StringToGenderEnumConverter();
        System.out.println(converter.convert("male").name());
    }
}
