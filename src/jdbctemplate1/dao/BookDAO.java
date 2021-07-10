package jdbctemplate1.dao;

import aop1.aopxml.Book;
import jdbctemplate1.untity.T_Book;

import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-29 15:54
 */
public interface BookDAO {

    void addBook(T_Book book);

    void updateBook(T_Book book);

    void deleteBook(int id);

    int selectCount();

    T_Book getBookById(int id);

    List<T_Book> getAllBook();

    int[] batchAll(List<Object[]> books);

    int[] batchUpdate(List<Object[]> books);

    int[] batchDelete(List<Object[]> books);
}
