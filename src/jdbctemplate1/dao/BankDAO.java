package jdbctemplate1.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-30 13:43
 */
@Repository
public interface BankDAO {

    void getMoney(int money,int id);

    void addMoney(int money, int id);

}
