package txdemo.testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import txdemo.service.BankService;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-30 18:26
 */
public class TestSpring1 {

    @Test
    public void test1(){

        ApplicationContext context = new ClassPathXmlApplicationContext("txdemo/bean1.xml");

        BankService bankService = context.getBean("bankService", BankService.class);
        bankService.getAddMoney(1, 2, 100);

    }

}
