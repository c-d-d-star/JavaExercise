package org.example.arithmetic.stack;

import org.example.arithmetic.link.Link;

public class LinkedStack {
    private long data; // 存储数据
    private Link next;
    // 这个就只是存储的是一个元素的内容
    public LinkedStack(long dd){
        data=dd;// 构造函数当中传入当前的数据值
    }
}
// 采用链表的形式来实现栈的结构

// java当中节点的插入是怎么样来实现的 创建出一个新的链表 然后进行赋值的操作
/*
*
* Link newLink=new Link(dd);
* newLink.next=first;
* first=newLink;
*
* */


/*
* 删除操作是怎么样实现的
*
* Link temp =first；
* first=first.next;
* return temp;
*
*
* */
