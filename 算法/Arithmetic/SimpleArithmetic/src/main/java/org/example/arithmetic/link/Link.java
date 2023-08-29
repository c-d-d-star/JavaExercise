package org.example.arithmetic.link;

public class Link {
    // 在链表当中所有的元素存放都是放在节点当中的
    // 节点是某个类对象
    // 采用的自引用式的方式
    // 链表的形式也是多种多样的
    // 采用引用的方式式比较好的，在实际的开发应用当中是可以直接指向下一个元素的地址空间的
    // 这个是相当于的是
    public int iData;
    public double dData;
    // 这个是模拟的数据项
    public Link next;


    public Link(int id,int dd){
        iData=id;
        dData=dd;

    }
    public void displayLink(){
        System.out.println();
    }

}



// 这个就是将一开始的节点当作是一个节点的样式
class LinkList{
   private Link first; //维护的是单链表
    public LinkList(){
       first=null;
    }
    public boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(int id,int dd){
        Link newLink=new Link(id,dd);
        // 进行链表的插入的时候都是创建出来一个新的链表元素，然后进行链表的插入
        newLink.next=first;
        newLink=first;
    }
    public Link romoveFirst(){
        Link temp=first;
        first=first.next;
        return temp;
    }
    public void display(){
        Link current=first;
        while(current!=null){
            current.displayLink();
            current=current.next;
            // 链表的查找的元素也是这样来进行的
        }
    }
    //删除1指定的节点
    // 存储的元素是以整型确定的
    // 删除的是指定的元素具体的值
    public Link find(int key){
        Link current=first; // 创建出一个像头节点的元素
        while(current.iData!=key){
            if(current.next==null) return null;
            current=current.next;
        }
        return current; // 跳出循环的时候是找到了符合条件的元素
    }
    public Link delete(int key){
       Link current=first;
       Link privious=first;

       return current;
    }
}
// 这个就是双端队列的使用


class Link1{
    public long dData;
    public Link1 next;
    public Link1 previous;


    public Link1(long d){
       dData=d;
    }
    public void display(){
        System.out.println(dData+" ");
    }
}


class DoubleLinkedList {
    private Link1 first; // 这个是指向的是第一个指针
    private Link1 last; // 这个是指向的最后的一个指针
    public DoubleLinkedList(){
        first=null;
        last=null;
    }
    //进行插入的时候是创建出一个新的节点
    public boolean isEmpty(){
        return first==null;
    }
    public void insertFirst(long dd){
        Link1 newlink=new Link1(dd);
        if(isEmpty()){
            last=newlink;
        }else first.previous=newlink;
        newlink.next=first;
        newlink=first;
    }

    public void insertLast(long dd){
        Link1 newlink=new Link1(dd);
        if(isEmpty()){
            first=newlink;
        }else{
            last.next=newlink;
            newlink.previous=last;
        }
        last=newlink;

        // 头指针和尾指针都是可以创建出新的元素来代替他的
    }
}
class FirstLastLink{
    private long iData;
    private Link first;
    private Link last;

    public FirstLastLink(){
        first=null;
        last=null;
    }
    // 接着就是双端队列的增删改查的操作是怎么样的

    public boolean isEmpty(){
        // 双链表的判空操作
        return first==null;
    }
    public void insertFirst(int dd,int id){
        // 将原始的数据给带入到里面
        Link newlLink=new Link(dd,id);//将原始的数据放到里面来
        if(isEmpty()){
            last=newlLink;
        }

    }
}

// 最后是可以加上迭代器来处理的
