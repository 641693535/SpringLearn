package ioc2.testdemo;

import ioc2.collectiontype.Water;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-25 20:19
 */
public class TestSpring3 {

    @Test
    public void test1(){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("ioc2/bean3.xml");

//        MyBean myBean = context.getBean("myBean", MyBean.class);
//        System.out.println(myBean);
        Water myBean = context.getBean("myBean", Water.class);
        Water myBean1 = context.getBean("myBean", Water.class);
        System.out.println(myBean);
        System.out.println(myBean == myBean1);

    }

}
