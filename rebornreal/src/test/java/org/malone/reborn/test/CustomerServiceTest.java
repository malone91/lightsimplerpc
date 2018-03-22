package org.malone.reborn.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.malone.reborn.model.Customer;
import org.malone.reborn.service.CustomerService;

import java.util.List;

/**
 * Created by Ablert
 * on 2018/3/21.
 */
public class CustomerServiceTest {

    private final CustomerService customerService;

    public CustomerServiceTest() {
        this.customerService = new CustomerService();
    }

    @Before
    public void init() {
        //初始化数据库
    }

    @Test
    public void getCustomerList() throws Exception {
        List<Customer> customerList = customerService.getCustomerList(null);
        Assert.assertEquals(2,customerList.size());
    }
}
