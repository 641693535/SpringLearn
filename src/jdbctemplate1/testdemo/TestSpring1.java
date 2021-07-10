package jdbctemplate1.testdemo;

import jdbctemplate1.service.BookService;
import jdbctemplate1.untity.T_Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author RZBlegion    Email:641693535@qq.com
 * @version 1.0
 * @Description TODO
 * @Date 2021-06-29 15:59
 */
public class TestSpring1 {

    @Test
    public void test1(){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("jdbctemplate1/bean1.xml");


        BookService bookService = context.getBean("bookService", BookService.class);

        T_Book t_book = new T_Book();

        //添加
//        t_book.setUser_id(1);
//        t_book.setUsername("Java");
//        t_book.setUstatus("adequate");
//        bookService.addBook(t_book);
//      修改
//        t_book.setUser_id(1);
//        t_book.setUsername("JdbcTemplate");
//        t_book.setUstatus("adequate");
//        bookService.updateBook(t_book);
        //删除
//        bookService.deleteBook(1);

        //查询表中有多少条记录
//        int count = bookService.selectCount();
//        System.out.println(count);

        //查询并返回某个对象
//        T_Book bookById = bookService.getBookById(1);
//        System.out.println(bookById);

        //查询并返回表中的所有数据
//        List<T_Book> allBook = bookService.getAllBook();
//        System.out.println(allBook);

        //批量添加数据
        ArrayList books = new ArrayList();
        books.add(new String[]{"2", "Mysql", "adequate"});
        books.add(new String[]{"3", "JDBCTemplate", "adequate"});
        books.add(new String[]{"4", "Spring", "adequate"});

        int[] ints = bookService.batchAll(books);
        System.out.println(Arrays.toString(ints));

        //批量修改数据
//        ArrayList books = new ArrayList();
//        books.add(new String[]{"Spring", "adequate", "2"});
//        books.add(new String[]{"Spring", "adequate", "3"});
//        books.add(new String[]{"Spring", "adequate", "4"});
//        int[] ints = bookService.batchUpdate(books);
//        System.out.println(Arrays.toString(ints));

        //批量删除数据
        ArrayList ids = new ArrayList();
        ids.add(new String[]{"2"});
        ids.add(new String[]{"3"});
//        ids.add(new String[]{"4"});
        int[] is = bookService.batchDelete(ids);
        System.out.println(Arrays.toString(is));

    }

}
