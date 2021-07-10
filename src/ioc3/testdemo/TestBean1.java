package ioc3.testdemo;

import ioc3.config.SpringConfig;
import ioc3.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-27 15:00
 */
public class TestBean1 {

    @Test
    public void test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("ioc3/bean1.xml");

        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

    }

    //使用完全注解开发
    @Test
    public void test2(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

}
