package ioc2.testdemo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-27 11:25
 */
public class TestSpring6 {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc2/bean6.xml");

        DataSource dataSource = context.getBean("dataSource", DataSource.class);

        System.out.println(dataSource);
    }

}
