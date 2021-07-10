package ioc2.testdemo;

import ioc2.collectiontype.Water;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-25 19:55
 */
public class TestSpring2 {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc2/bean2.xml");
        Water water = context.getBean("water", Water.class);
        System.out.println(water.toString());
    }

}
