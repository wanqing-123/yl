package com.ayalamih.domain;

import com.ayalamih.enums.GenderEnum;

/**
 * com.ayalamih.domain
 *
 * @author ayalamih.
 * @date 3:38 PM, 07/03/2018
 * @contact 31007354@qq.com
 */
public class Person {
    private String name;
    private GenderEnum gender;

    public Person() {
    }

    public Person(String name, GenderEnum genderEnum) {
        this.name = name;
        this.gender = genderEnum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public GenderEnum getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
