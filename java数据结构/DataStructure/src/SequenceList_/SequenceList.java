package SequenceList_;


//如果是需要用到泛型的话是需要加到类说明上面的
//泛型是在创建对象，及编译的是时候来确定的
public class SequenceList<T> {
    //首先是定义他的结构的特征
    //存放元素的数组
    private T[] eles;

    //记录数组的个数
    private int N;


    //构造方法，我只要传入的是数值大小，就能创建多长的线性表的结构
    //然后是将元素给传递进去
    public SequenceList(int capacity){
        eles = (T[])new Object[capacity];
        N=0;
    }
    public void clear(){
        N=0;
    }
    public boolean isEmpty(){
       return N==0;
    }
    public int length(){
        return N;
    }
    //任何传递进来的值，进行一些操作，那么对于这个值的判断是必不可少的
    public T get(int i){
        if (i<0||i>N) throw new RuntimeException("数组越界异常");
        return eles[i];
    }
    //插入元素的时候是需要将原来的数组给传递进去的
    //插入的时候是需要判断元素是否是满的
    public void insert(int i,T t){
        if (N==eles.length) throw new RuntimeException("当前表已满");
        //if (i<0||i>N) throw new RuntimeException("插入的位置是不合法的");
        for (int index=N;index>i;index--) eles[index]=eles[index-1]; //这个是在最后面进行跟换的
        eles[N++] = t;
    }
    //删除指定位置i处的元素，并返回该元素(我只要是传递是下标元素就好了）
    public T getElement(int i){
        if (i<0||i>N) throw new RuntimeException("删除的位置是不合法的");
        T result=eles[i];
        for (int j = i; j <N-1; j++) {
            eles[j]=eles[j+1];
        }
        N--;
        return result;
    }

}

/**
 * 1.public void clear()：空置线性表
 * 2.publicboolean isEmpty()：判断线性表是否为空，是返回true，否返回false
 * 3.public int length():获取线性表中元素的个数
 * 4.public T get(int i):读取并返回线性表中的第i个元素的值
 * 5.public void insert(int i,T t)：在线性表的第i个元素之前插入一个值为t的数据元素。
 * 6.public void insert(T t):向线性表中添加一个元素t
 * 7.public T remove(int i):删除并返回线性表中第i个数据元素。
 * 8.public int indexOf(T t):返回线性表中首次出现的指定的数据元素的位序号，若不存在，则返回-1。
 * */

//线性表和数组的增删改查是必须知道数组的指针是怎么样来进行移动的（元素的下表是怎么样来进行操作的）
class SequenceListTest {
    public static void main(String[] args) {
        //创建顺序表对象
        SequenceList sl = new SequenceList(10);
        //测试插入
        System.out.println(sl);
        sl.insert(1,"姚明");
        sl.insert( 2,"科比");
        sl.insert(3,"麦迪");
        sl.insert( 4,"詹姆斯");
        //测试获取
        Object getResult = sl.get(1);
        System.out.println("获取索引1处的结果为：" + getResult);
        //测试删除
//        String removeResult = sl.remove(0);
//        System.out.println("删除的元素是："+removeResult);
        //测试清空
        sl.clear();
        System.out.println("清空后的线性表中的元素个数为:" + sl.length());
    }
}