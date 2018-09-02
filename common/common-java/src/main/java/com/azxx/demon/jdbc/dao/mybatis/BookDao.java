package com.azxx.demon.jdbc.dao.mybatis;

import com.azxx.demon.jdbc.entity.Books;

import java.util.List;

/**
 * Created by Smile on 2018/9/2.
 */
public interface BookDao {

    List<Books> getAllBooks();


}
