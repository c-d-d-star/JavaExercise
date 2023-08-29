package com.ithema.service.impl;

import com.ithema.dao.BookDao;
import com.ithema.service.BookService;

public class BookServiceimpl implements BookService {
    private BookDao bookDao;
    //注入到其他的类里面的时候是需要将其进行更改的，必须提供方式来进行更改
    //这个就是最为主要的一个代码了
    public void save() {
        System.out.println("bookservice is saving");
        bookDao.save();
    }
    //现在想在业务层来使用数据库里面的对象，但是有不能是直接new出来的，避免耦合度高的问题

    public void setBookDao(BookDao bookDao){
            this.bookDao=bookDao;
    }
}
