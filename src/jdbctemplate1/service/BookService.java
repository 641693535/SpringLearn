package jdbctemplate1.service;

import aop1.aopxml.Book;
import jdbctemplate1.dao.BookDAO;
import jdbctemplate1.untity.T_Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-29 15:54
 */
@Service
public class BookService {

    //将BookDAO注入
    @Autowired
    private BookDAO bookDAO;

    //向数据库中添加
    public void addBook(T_Book book){
        bookDAO.addBook(book);
    }

    //修改
    public void updateBook(T_Book book) {
        bookDAO.updateBook(book);
    }

    //删除
    public void deleteBook(int id) {
        bookDAO.deleteBook(id);
    }

    //查询表中有多少条记录
    public int selectCount(){
        int count = bookDAO.selectCount();
        return count;
    }

    //查询并返回某个对象
    public T_Book getBookById(int id) {
        T_Book bookById = bookDAO.getBookById(id);
        return bookById;
    }

    //查询表中所有的数据
    public List<T_Book> getAllBook(){
        List<T_Book> allBook = bookDAO.getAllBook();
        return allBook;
    }

    //批量添加数据
    public int[] batchAll(List<Object[]> books){
        int[] i = bookDAO.batchAll(books);
        return i;
    }

    //批量修改数据
    public int[] batchUpdate(List<Object[]> books) {
        int[] ints = bookDAO.batchUpdate(books);
        return ints;
    }

    //批量删除数据
    public int[] batchDelete(List<Object[]> books) {
        int[] ints = bookDAO.batchDelete(books);
        return ints;
    }

}
