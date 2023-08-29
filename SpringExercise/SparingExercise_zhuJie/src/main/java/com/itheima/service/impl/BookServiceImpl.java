package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
    private BookDao bookDao;


    // 这个不是通过构造器来进行注入的
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
