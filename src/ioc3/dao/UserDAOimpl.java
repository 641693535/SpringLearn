package ioc3.dao;

import org.springframework.stereotype.Repository;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-28 11:49
 */
//通过注解来赋值
@Repository(value = "userImp")
public class UserDAOimpl implements UserDAO {

    @Override
    public void add() {
        System.out.println("dao...add......");
    }
}
