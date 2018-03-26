package org.malone.reborn.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.malone.reborn.helper.DataBaseHelper;
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
        customerService = new CustomerService();
    }

    /**
     * 测试之前数据库里的数据还原为原来的数据
     */
    @Before
    public void init() {
        //初始化数据库
        DataBaseHelper.executeSqlFile("sql/customer_test.sql");
    }

    @Test
    public void getCustomerList() throws Exception {
        boolean result = customerService.deleteCustomer(1L);
        System.out.println(result);
    }
}
