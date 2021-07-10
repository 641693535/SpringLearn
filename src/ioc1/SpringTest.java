package ioc1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-21 12:59
 */
public class SpringTest {

    /**
     * 测试User
     */
    @Test
    public void test1(){

        //获取、读取配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc1/beanTest.xml");

        //获取XML配置文件中的指定id对象
        User user = context.getBean("user", User.class);
        //调用获取到类的方法
        user.add();
        System.out.println(user);

    }

    /**
     * 测试Book
     */
    @Test
    public void testBook(){

        //读取XML文件
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc1/beanTest.xml");

        //通过配置文件获取类
        Book book = context.getBean("book", Book.class);
        //使用book的toString查看是否赋值成功
        System.out.println(book.toString());
    }

    /**
     * 测试Oders类，通过有参数构造器赋值
     */
    @Test
    public void testOrders(){

        ApplicationContext context = new ClassPathXmlApplicationContext("ioc1/beanTest.xml");

        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders.toString());
    }

}
