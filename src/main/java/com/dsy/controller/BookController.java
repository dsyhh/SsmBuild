package com.dsy.controller;

import com.dsy.pojo.Books;
import com.dsy.service.BookService;
import com.dsy.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author dsy
 * @Date 2023/7/20 10:21
 **/
@Controller
@RequestMapping("/")
public class BookController
{
    @Autowired
    @Qualifier("bookService")
    private BookService bookService;

    @RequestMapping("allBook")
    public String list(Model model)
    {
        List<Books>list= bookService.queryAllBooks();
        model.addAttribute("list",list);
        return "/allBook";
    }

}
