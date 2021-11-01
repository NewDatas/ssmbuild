package cn.peng.service.impl;

import cn.peng.dao.BookMapper;
import cn.peng.pojo.Books;
import cn.peng.service.BookService;

import java.util.List;

/**
 * @Author:tangLiPeng
 * @Date:2021/8/11 17:29
 */

public class BookServiceImpl implements BookService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        System.out.println(books);
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public List<Books> queryBookByName(String queryBookName) {
        return bookMapper.queryBookByName(queryBookName);
    }
}
