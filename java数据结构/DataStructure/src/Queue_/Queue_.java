package Queue_;

public class Queue_ {
    private int maxsize; //这个是最大的存储容量
    private int rear; //队列尾
    private int front; //队头
    private int [] array;//存储数据



    public Queue_(int arraymax){
        maxsize=arraymax;
        array = new int[maxsize];
        rear=-1;
        front=-1;
    }
}
