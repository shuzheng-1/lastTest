package com.qf.test.service.impl;
import com.qf.test.exception.MyException;
import com.qf.test.mapper.OrdersMapper;
import com.qf.test.pojo.OrderDetail;
import com.qf.test.pojo.Orders;
import com.qf.test.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService implements IOrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    public OrdersMapper getOrdersMapper() {
        return ordersMapper;
    }

    public void setOrdersMapper(OrdersMapper ordersMapper) {
        this.ordersMapper = ordersMapper;
    }

    public void insert(Orders orders, OrderDetail orderDetail) throws MyException {

        int id = ordersMapper.insertOrders(orders);
        orderDetail.setOrdersId(id);


        if (true) {
            throw new MyException("订单添加失败");

        }

        ordersMapper.insertOrderDetail(orderDetail);

    }

}
