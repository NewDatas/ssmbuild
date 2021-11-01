package cn.peng.dao;

import cn.peng.pojo.Books;
import java.util.List;

/**
 * @Author:tangLiPeng
 * @Date:2021/8/11 17:21
 */
public interface BookMapper {
    //增加一个book
    int addBook(Books books);

    //根据id删除一个book
    int deleteBookById(int id);

    //更新book
    int updateBook(Books books);

    //根据id返回一个book
    Books queryBookById(int id);

    //查询所有book
    List<Books> queryAllBook();

    //搜索
    List<Books> queryBookByName(String queryBookName);
}
