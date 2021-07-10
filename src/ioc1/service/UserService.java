package ioc1.service;

import ioc1.dao.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-22 15:41
 */
public class UserService {

    private UserDAO userDao;

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ioc1/bean1.xml");

        UserService userservice = context.getBean("userService", UserService.class);
        userservice.add();

    }

    public void setUserDao(UserDAO userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("add......");

        //通过原始方式实现调用UserDAO的update方法
//        UserDAO userDAOimpl = new UserDAOimpl();
        userDao.update();
    }

}
