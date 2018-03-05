package com.ayalamih.design.facade;

/**
 * com.ayalamih.design.facade
 *
 * @author ayalamih.
 * @date 1:22 PM, 01/03/2018
 * @contact 31007354@qq.com
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + "]";
    }
}
