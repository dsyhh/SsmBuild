package com.dsy.service;

import com.dsy.dao.BookMapper;
import com.dsy.pojo.Books;

import java.util.List;

/**
 * @Author dsy
 * @Date 2023/7/20 09:17
 **/
public class BookServiceImpl implements BookService
{

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper)
    {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBooks(Books book)
    {
        return bookMapper.addBooks(book);
    }

    @Override
    public int deleteBookById(Integer id)
    {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBooks(Books book)
    {
        return bookMapper.updateBooks(book);
    }

    @Override
    public int queryBookById(Integer id)
    {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks()
    {
        return bookMapper.queryAllBooks();
    }
}
