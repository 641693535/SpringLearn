package ioc3.service;

import ioc3.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-27 15:39
 */
//创建注解，此处value值自定义了。Value如果不写，则为类的名，但首字母小写
//@Component(value = "userService") //<bean id="userService" class....../>
//@Service
//@Controller
@Service
public class UserService {
    @Autowired//通过类型自动注入赋值
    @Qualifier(value = "userImp")//类型筛选后，通过名称进行自动赋值
    private UserDAO userDAO;

    @Value(value = "abc")
    private String str;

    public void add() {
        System.out.println("Service add......" + str);
        userDAO.add();
    }

}
