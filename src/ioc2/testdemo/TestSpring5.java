package ioc2.testdemo;

import ioc2.autowire.Employee;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-26 23:48
 */
public class TestSpring5 {

    @Test
    public void test1(){

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("ioc2/bean5.xml");

        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);

    }

}
