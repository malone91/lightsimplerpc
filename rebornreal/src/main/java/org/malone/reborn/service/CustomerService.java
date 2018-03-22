package org.malone.reborn.service;

import org.malone.reborn.model.Customer;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Ablert
 * on 2018/3/21.
 * 提供客户数据服务
 */
public class CustomerService {

    /**
     * 获取客户列表
     * @param customer
     * @return
     */
    public List<Customer> getCustomerList(Customer customer) {
        return null;
    }

    /**
     * 获取客户
     * @param id
     * @return
     */
    public Customer getCustomer(long id) {
        return null;
    }

    /**
     * 创建客户
     * @param map
     * @return
     */
    public boolean createCustomer(Map<String,Objects> map) {
        return false;
    }

    /**
     * 更新客户
     * @param id
     * @param map
     * @return
     */
    public boolean updateCustomer(long id,Map<String,Objects> map) {
        return false;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        return false;
    }
}
