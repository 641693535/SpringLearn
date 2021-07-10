package ioc2.testdemo;

import ioc2.collectiontype.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-22 18:21
 */
public class TestSpring1 {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc2/bean1.xml");

        Stu stu = context.getBean("stu", Stu.class);
        System.out.println(stu);
    }

}
