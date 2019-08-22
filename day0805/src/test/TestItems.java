

import com.qf.test.exception.MyException;
import com.qf.test.pojo.OrderDetail;
import com.qf.test.pojo.Orders;
import com.qf.test.service.IOrdersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class TestItems {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        IOrdersService ordersService=  applicationContext.getBean("ordersService",IOrdersService.class);

        Orders orders = new Orders(1,4,new Date(),"rr");

        OrderDetail orderDetail = new OrderDetail(2,5);

        try {
            ordersService.insert(orders,orderDetail);
        } catch (MyException e) {
            e.printStackTrace();
        }

    }






}
