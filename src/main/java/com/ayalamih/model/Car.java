package com.ayalamih.model;

/**
 * com.ayalamih.model
 *
 * @author ayalamih.
 * @date 11:30 AM, 25/01/2018
 * @contact 31007354@qq.com
 */
public class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
