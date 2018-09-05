package com.azxx.demon.service;

import com.azxx.demon.dao.mybatis.BookDao;
import com.azxx.demon.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao booksDao;

    public List<Book> getBooks(){
        return booksDao.getAllBooks();
    }
}
