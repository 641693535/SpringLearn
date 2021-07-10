package ioc2.testdemo;

import ioc2.factorybean.Orders;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-26 20:19
 */
public class TestSpring4 {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc2/bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders);
        System.out.println("第四步，获取创建的实例.");

        context.close();
    }

}
