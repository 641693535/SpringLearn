package aop1.testdemo;

import aop1.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-29 15:21
 */
public class TestSpring2 {

    @Test
    public void test1(){

        ApplicationContext context = new ClassPathXmlApplicationContext("aop1/bean2.xml");

        Book book = context.getBean("book", Book.class);

        book.buy();

    }

}
