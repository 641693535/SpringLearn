package jdbctemplate1.service;

import jdbctemplate1.dao.BankDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-30 13:49
 */
@Service
public class BankService {

    @Autowired
    private BankDAO bankDAO;

    public void getAddMoney(int getId, int addId,int money) {
        bankDAO.getMoney(money, getId);
        bankDAO.addMoney(money, addId);
    }

}
