package org.malone.reborn.service;

import org.malone.reborn.helper.DataBaseHelper;
import org.malone.reborn.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.*;

/**
 * Created by Ablert
 * on 2018/3/21.
 * 提供客户数据服务
 */
public class CustomerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

    /**
     * 获取客户列表 初级版本
     * @return
     */
    public List<Customer> getCustomerList() {
        Connection connection = null;
        try {
            List<Customer> customerList = new ArrayList<Customer>();
            String sql = "select * from customer";
            connection = DataBaseHelper.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Customer customer;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setId(resultSet.getLong("customer_id"));
                customer.setName(resultSet.getString("name"));
                customer.setContact(resultSet.getString("contact"));
                customer.setTelephone(resultSet.getString("telephone"));
                customer.setEmail(resultSet.getString("email"));
                customer.setRemark(resultSet.getString("remark"));
                customerList.add(customer);
            }
            return  customerList;
        } catch (SQLException e) {
            LOGGER.error("execute sql failure", e);
        }
        return null;
    }

    /**
     * 获取客户列表 简单方法
     * @return
     */
    public List<Customer> getCustomerListSimple() {
        String sql = "select * from customer";
        return DataBaseHelper.queryEntityList(Customer.class, sql);
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
    public boolean createCustomer(Map<String,Object> map) {
        return DataBaseHelper.insertEntity(Customer.class, map);
    }

    /**
     * 更新客户
     * @param id
     * @param map
     * @return
     */
    public boolean updateCustomer(long id, Map<String,Object> map) {
        return DataBaseHelper.updateEntity(Customer.class, id, map);
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    public boolean deleteCustomer(long id) {
        return DataBaseHelper.deleteEntity(Customer.class, id);
    }
}
