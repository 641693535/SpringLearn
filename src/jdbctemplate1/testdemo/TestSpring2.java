package jdbctemplate1.testdemo;

import jdbctemplate1.service.BankService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-30 13:55
 */
public class TestSpring2 {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbctemplate1/bean2.xml");

        BankService bankService = context.getBean("bankService", BankService.class);

        bankService.getAddMoney(1, 2, 100);
    }

}
