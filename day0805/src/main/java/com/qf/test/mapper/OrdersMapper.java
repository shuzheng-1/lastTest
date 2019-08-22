package com.qf.test.mapper;

import com.qf.test.pojo.OrderDetail;
import com.qf.test.pojo.Orders;

public interface OrdersMapper {

    public int insertOrders(Orders orders);

    public void insertOrderDetail(OrderDetail orderDetail);
}
