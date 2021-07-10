package jdbctemplate1.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-30 13:43
 */
@Repository
public class BankDAOImp implements BankDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void getMoney(int money,int id) {
        String sql = "update t_account set money=money-? where id=?";

        int update = jdbcTemplate.update(sql, money, id);
        System.out.println(update);
    }

    @Override
    public void addMoney(int money, int id) {
        String sql = "update t_account set money=money+? where id=?";
        int update = jdbcTemplate.update(sql, money, id);
        System.out.println(update);
    }


}
