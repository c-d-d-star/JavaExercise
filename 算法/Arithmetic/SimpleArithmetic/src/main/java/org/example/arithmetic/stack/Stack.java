package org.example.arithmetic.stack;

public class Stack {
    private int maxSize;
    private long [] stackArray;
    private int top;

    public Stack(int s) {
        maxSize=s;
        stackArray=new long[maxSize];
        top=-1;
    }


    // 下面就是一些初始化的方法
    // 出栈、
    public long pop(){
        return stackArray[top--];
    }
    // 出栈栈顶元素
    public long peek(){
        return stackArray[top];

    }
    // 入栈
    public void push(long j){
        stackArray[top++]=j;

    }
    // 栈空
    public boolean isEmpty(){
        return top==-1;
    }
    // 栈满
    public boolean isFull(){
        return top==maxSize-1;
    }
}
