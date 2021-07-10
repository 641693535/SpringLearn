package txdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import txdemo.dao.BankDAO;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-30 18:20
 */
@Repository
@Transactional
public class BankService {

    @Autowired
    private BankDAO bankDAO;

    /**
     * @param getId 转款人
     * @param addId 被转款人
     * @param m 转款金额（整数）
     */
    public void getAddMoney(int getId, int addId,int m) {

        bankDAO.getMoney(getId,m);

        bankDAO.addMoney(addId,m);

    }

}
