package cn.peng.controller;

import cn.peng.pojo.Books;
import cn.peng.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:tangLiPeng
 * @Date:2021/8/11 23:22
 */
@Controller
@RequestMapping("/book")
public class BookController {

    //controller层调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍，并返回一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    //增加书籍界面
    @RequestMapping("/addBookUI")
    public String addBookUI() {
        return "addBook";
    }
    //增加书籍
    @RequestMapping("/addBook")
    public String addBook(Books books) {
        bookService.addBook(books);
        return "redirect:/book/allBook";    //重定向
    }

    //删除书籍（@PathVariable("id")）
    @RequestMapping("/toDeleteBook")
    public String deleteBook(int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //修改书籍界面
    @RequestMapping("/updateBookUI")
    public String updateBookUI(Model model,int id) {
        Books books = bookService.queryBookById(id);
        model.addAttribute("qbooks",books);
        return "updateBook";
    }
    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books) {
        int i = bookService.updateBook(books);
//        List<Books> list = bookService.queryAllBook();
//        model.addAttribute("list",list);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model) {
        //System.out.println("==========queryBook======");  //控制台输出
        List<Books> list = bookService.queryBookByName(queryBookName);
        //System.err.println("queryBook==>" + books);   //日志输出
        if (list == null) {
            list = bookService.queryAllBook();
            model.addAttribute("error","书籍未查到");
        }
        model.addAttribute("list",list);
        return "queryBook";
    }
}
