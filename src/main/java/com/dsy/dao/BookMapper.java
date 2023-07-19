package com.dsy.dao;

import com.dsy.pojo.Books;

import java.util.List;

/**
 * @Author dsy
 * @Date 2023/7/19 18:19
 **/
public interface BookMapper
{
    int addBooks(Books book);
    int deleteBookById(Integer id);
    int updateBooks(Books book);
    int queryBookById(Integer id);
    List<Books> queryAllBooks();
}
