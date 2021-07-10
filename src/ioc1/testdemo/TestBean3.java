package ioc1.testdemo;

import ioc1.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-22 17:14
 */
public class TestBean3 {

    @Test
    public void test1(){

        ApplicationContext context = new ClassPathXmlApplicationContext("ioc1/bean3.xml");

        Emp emp = context.getBean("emp", Emp.class);


        System.out.println(emp);
    }
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc1/bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }

}
