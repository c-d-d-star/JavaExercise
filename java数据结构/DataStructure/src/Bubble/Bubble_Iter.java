package Bubble;

import java.util.Iterator;

public class Bubble_Iter<T> implements Iterable<T> {



    //存储元素的数组
    private T[] eles;
    //记录当前顺序表中的元素个数
    private int N;

    public T[] getEles() {
        return eles;
    }

    public int getN() {
        return N;
    }


    public void setEles(T[] eles) {
        this.eles = eles;
    }

    public void setN(int n) {
        N = n;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }
}

class SIterator<T> implements Iterator<T>{
    private int cur;
    public SIterator(){
        this.cur=0;
    }
    @Override
    public boolean hasNext() {
        return cur<N;
    }
    @Override
    public T next() {
        return eles[cur++];
    }
}

