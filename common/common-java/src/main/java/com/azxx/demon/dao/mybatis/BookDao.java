package com.azxx.demon.dao.mybatis;

import com.azxx.demon.entity.Book;

import java.util.List;

/**
 * Created by Smile on 2018/9/2.
 */
public interface BookDao {

    List<Book> getAllBooks();

}
