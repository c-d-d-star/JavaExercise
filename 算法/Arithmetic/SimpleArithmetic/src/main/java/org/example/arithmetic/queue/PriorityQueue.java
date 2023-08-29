package org.example.arithmetic.queue;


// 这个是优先队列
public class PriorityQueue {
    // 优先队列是没有头指针、尾指针的
    private int maxSize;
    private long[] quarry;
    private int nItems;

    public PriorityQueue(int s) {
        maxSize = s;
        quarry = new long[maxSize];
        nItems = 0;
    }

    // 优先队列最为主要的就是增么把元素添加进来
    public void insert(long item) {
        int j;
        if (nItems == 0) quarry[nItems++] = item;
        else {
            //从后面开始往前面进行比较
            for (j = nItems - 1; j >=0 ; j--) {
                if (item > quarry[j])
                    quarry[j + 1] = quarry[j];

                else
                    break;// 和当前位置元素全部来比较
            }
            quarry[j + 1] = item; // 任何的装载的操作是不需要放在循环当中的
            nItems++;
        }

    }

    public long remove() {
        return quarry[--nItems];
    }

    public boolean isEmpty() {
        return nItems==0;
    }
}

class PriorityQueueTest{
    public static void main(String[] args) {
        PriorityQueue priorityQueue=new PriorityQueue(5);
        priorityQueue.insert(30);
        priorityQueue.insert(50);
        priorityQueue.insert(10);
        priorityQueue.insert(40);
        priorityQueue.insert(20);
        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove());
        }
    }
}
