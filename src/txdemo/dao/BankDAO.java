package txdemo.dao;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-30 18:19
 */
public interface BankDAO {
    void getMoney(int getId,int m);

    void addMoney(int addId,int m);
}
