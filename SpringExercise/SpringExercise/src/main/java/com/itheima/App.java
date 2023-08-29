package com.itheima;

import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main(String[] args) {
        //获取IOC容器
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext01.xml");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

        // 这个就是没有直接创建对象就是从容器当中拿出了一个对象
        // 此处是没有自己将对象给创建出来的，只是将配置文件当中的内容给读取出来
        // 这个就是依赖注入
    }
}

/*
* Spring当中对象的创建是可以通过三种方式来进行创建的
* 1.通过构造器来进行创建的
* 2.通过静态工厂来创建的
*
* */
