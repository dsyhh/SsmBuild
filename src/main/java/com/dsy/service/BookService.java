package com.dsy.service;

import com.dsy.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author dsy
 * @Date 2023/7/20 09:14
 **/
public interface BookService
{
    int addBooks(Books book);
    int deleteBookById(Integer id);
    int updateBooks(Books book);
    int queryBookById(Integer id);
    List<Books> queryAllBooks();
}
