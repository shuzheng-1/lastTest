package com.qf.test.service;

import com.qf.test.exception.MyException;
import com.qf.test.pojo.OrderDetail;
import com.qf.test.pojo.Orders;
public interface IOrdersService {

    public void insert(Orders orders, OrderDetail orderDetail) throws MyException;
}
