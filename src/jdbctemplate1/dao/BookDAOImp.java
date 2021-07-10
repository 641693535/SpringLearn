package jdbctemplate1.dao;

import jdbctemplate1.untity.T_Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-29 15:54
 */
@Repository
public class BookDAOImp implements BookDAO{

    //注入JDBCTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //向数据库中添加的具体方法
    @Override
    public void addBook(T_Book book) {
        //1创建SQL语句
        String sql = "insert into t_book values(?,?,?)";
        //2通过jdbctemplate操作数据库
        int update = jdbcTemplate.update(sql, book.getUser_id(), book.getUsername(), book.getUstatus());
        System.out.println(update);
    }

    //向数据库中修改的具体方法
    @Override
    public void updateBook(T_Book book) {
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        int update = jdbcTemplate.update(sql, book.getUsername(), book.getUstatus(), book.getUser_id());
        System.out.println(update);
    }

    @Override
    public void deleteBook(int id) {
        String sql = "delete from t_book where user_id=?";

        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);

    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";
        Integer count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }

    //查询并返回某个对象
    @Override
    public T_Book getBookById(int id) {

        String sql = "select * from t_book where user_id=?";

        T_Book t_book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<T_Book>(T_Book.class), id);

        return t_book;
    }

    @Override
    public List<T_Book> getAllBook() {
        String sql = "select * from t_book";
        List<T_Book> allBook = jdbcTemplate.query(sql, new BeanPropertyRowMapper<T_Book>(T_Book.class));
        return allBook;
    }

    @Override
    public int[] batchAll(List<Object[]> books) {

        String sql = "insert into t_book values(?,?,?)";

        int[] ints = jdbcTemplate.batchUpdate(sql, books);

        return ints;
    }

    @Override
    public int[] batchUpdate(List<Object[]> books) {
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, books);

        return ints;
    }

    @Override
    public int[] batchDelete(List<Object[]> books) {

        String sql = "delete from t_book where user_id=?";

        int[] ints = jdbcTemplate.batchUpdate(sql, books);

        return ints;
    }
}
