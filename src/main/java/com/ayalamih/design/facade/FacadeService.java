package com.ayalamih.design.facade;

import sun.dc.pr.PRError;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * com.ayalamih.design.facade
 *
 * @author ayalamih.
 * @date 2:16 PM, 01/03/2018
 * @contact 31007354@qq.com
 */
public class FacadeService {

    private ICustomerService consultation;
    private ICustomerService healthcare;

    public FacadeService() {
        this.consultation = new Consulation();
        this.healthcare = new HealthCare();
    }

    public void setServiceforCustomer(Customer customer) {
        registerCustomer(customer.getName());
        consultation.serve(customer.getName());
        healthcare.serve(customer.getName());
    }

    private void registerCustomer(String name) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
                + " INFO "
                + "[" + Thread.currentThread().getName() + "] "
                + "register for customer: " + name);
    }
}
