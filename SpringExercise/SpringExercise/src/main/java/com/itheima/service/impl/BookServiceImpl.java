package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;

import javax.jnlp.BasicService;

public class BookServiceImpl implements BookService {
    //此处还是自己造出了对象
    private BookDao bookDao;


    // 这个不是通过构造器来进行注入的
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        // 这个就是service层的对象想要调用dao层的对象的使用的方式是怎么样的
    }
}
