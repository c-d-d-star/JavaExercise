package org.example.arithmetic.queue;

public class Queue {
    private int maxSize;// 存储数据的个数
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;
    // 队列是有普通的队列和循环队列
    // 循环队列的增加和删除是不一样的
    public Queue(int s){
        maxSize=s; // 这个是表示的是存储的最多的元素的个数为多少
        queArray=new long[maxSize];
        front=0; // 头部元素的指向是指向0的
        rear=-1;
        nItems=0; // 这个是表示的是存储元素的个数
        // 自定义的数据结构
    }
    public void insert(long j){
        // 传递过来的值需要进行逻辑判断
        if(rear==maxSize-1)
            rear = -1; // 判断队列是否为满的情况
        queArray[++rear]=j; // 先把指针加上1
        nItems++; // 个数加上1的操作
    }
    public long remove(){
        if(front==maxSize)
            front=0; // 这个是出队的时候出满了，是一种假的满状态
        long temp=queArray[front++];
        nItems--;
        return temp;
    }
    public boolean isFull(){
        return nItems==maxSize;
    }
    public boolean isEmpty(){
        return nItems==0;
    }
    // 这个是简单的队列的一种实现

}
