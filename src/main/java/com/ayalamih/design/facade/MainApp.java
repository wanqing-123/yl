package com.ayalamih.design.facade;

/**
 * com.ayalamih.design.facade
 *
 * @author ayalamih.
 * @date 2:19 PM, 01/03/2018
 * @contact 31007354@qq.com
 */
public class MainApp {
    public static void main(String[] args) {
        Customer customer = new Customer("ayalamih");

        FacadeService service = new FacadeService();
        service.setServiceforCustomer(customer);
    }
}
