package txdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-30 18:19
 */
@Repository
public class BankImp implements BankDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void getMoney(int getId, int m) {
        String sql = "update t_account set money=money-? where id=?";

        jdbcTemplate.update(sql, m, getId);

    }

    @Override
    public void addMoney(int addId, int m) {
        String sql = "update t_account set money=money+? where id=?";

        jdbcTemplate.update(sql, m, addId);
    }
}
