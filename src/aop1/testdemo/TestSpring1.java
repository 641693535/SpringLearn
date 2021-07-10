package aop1.testdemo;

import aop1.aopanno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-29 12:43
 */
public class TestSpring1 {

    @Test
    public void test1(){

        ApplicationContext context = new
                ClassPathXmlApplicationContext("aop1/bean1.xml");

        User user = context.getBean("user", User.class);
        user.add();

    }

}
