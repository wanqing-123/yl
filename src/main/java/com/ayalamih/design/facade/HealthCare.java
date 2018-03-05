package com.ayalamih.design.facade;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * com.ayalamih.design.facade
 *
 * @author ayalamih.
 * @date 2:14 PM, 01/03/2018
 * @contact 31007354@qq.com
 */
public class HealthCare implements ICustomerService {
    @Override
    public void serve(String name) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + "HealthCare for customer: " + name);
    }
}
