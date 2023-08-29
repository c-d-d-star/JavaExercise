package NodeList_;

public class NodeList<T> {
   //存储元素
    public T item;
    // 指向下一个结点
    public NodeList next;
    //下一个节点是对象形式的
    //首先是存储的结构是怎么样的
    public NodeList(T item, NodeList next) {
        this.item = item;
        this.next = next;
    }
}

