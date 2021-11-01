package cn.peng.service;

import cn.peng.pojo.Books;

import java.util.List;

/**
 * @Author:tangLiPeng
 * @Date:2021/8/11 17:29
 */
public interface BookService {

    //增加一个Book
    int addBook(Books books);

    //根据id删除一个Book
    int deleteBookById(int id);

    //更新Book
    int updateBook(Books books);

    //根据id查询,返回一个Book
    Books queryBookById(int id);

    //查询全部Book,返回list集合
    List<Books> queryAllBook();

    //搜索Book
    List<Books> queryBookByName(String queryBookName);
}
