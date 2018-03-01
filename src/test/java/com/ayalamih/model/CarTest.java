package com.ayalamih.model;

import org.junit.Test;

/**
 * com.ayalamih.model
 *
 * @author ayalamih.
 * @date 12:17 PM, 25/01/2018
 * @contact 31007354@qq.com
 */
public class CarTest {

    @Test
    public void testWhenNumberOfCarObjectsInitialized_thenStaticCounterIncreases() {
        new Car("Jaguar", "V8");
        new Car("Bugatti", "W16");


        System.out.println(Car.numberOfCars);
    }
}
