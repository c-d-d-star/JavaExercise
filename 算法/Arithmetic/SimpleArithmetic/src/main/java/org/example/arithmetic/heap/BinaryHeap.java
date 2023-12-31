//package org.example.arithmetic.heap;
//public class BinaryHeap implements Comparable<T>{
//
//    public BinaryHeap() {
//        this(DEFAULT_CAPACITY);
//    }
//
//    public BinaryHeap(Comparable[] items) {
//        currentSize = items.length;
//        array = new Comparable[(currentSize + 2) * 11 / 10];
//
//        int i = 1;
//        for (Comparable item : items) {
//            array[i++] = item;
//        }
//        buildHeap();
//    }
//
//    public BinaryHeap(int capacity) {
//        currentSize = 0;
//        array = new Comparable[capacity + 1];
//    }
//
//    public void insert(Comparable x) {
//
//        // Percolate up
//        int hole = ++currentSize;
//        for (; hole > 1 && x.compareTo(array[hole / 2]) < 0; hole /= 2)
//            array[hole] = array[hole / 2];
//        array[hole] = x;
//    }
//
//
//    public Comparable findMin() {
//        if (isEmpty())
//            return null;
//        return array[1];
//    }
//
//
//    public Comparable deleteMin() {
//        if (isEmpty())
//            return null;
//
//        Comparable minItem = findMin();
//        array[1] = array[currentSize--];
//        percolateDown(1);
//
//        return minItem;
//    }
//
//
//    private void buildHeap() {
//        for (int i = currentSize / 2; i > 0; i--)
//            percolateDown(i);
//    }
//
//
//    public boolean isEmpty() {
//        return currentSize == 0;
//    }
//
//
//    public boolean isFull() {
//        return currentSize == array.length - 1;
//    }
//
//
//    public void makeEmpty() {
//        currentSize = 0;
//    }
//
//    private static final int DEFAULT_CAPACITY = 100;
//
//    private int currentSize;      // Number of elements in heap
//    private Comparable[] array; // The heap array
//
//    private void percolateDown(int hole) {
//        int child;
//        Comparable tmp = array[hole];//保存变量
//
//        for (; hole * 2 <= currentSize; hole = child) {
//            child = hole * 2;//获取左子树结点
//            //如果左子树结点不是堆的长度并且左子树大于右子树的值
//            if (child != currentSize && array[child + 1].compareTo(array[child]) < 0)
//                child++;//child指向右子树
//            if (array[child].compareTo(tmp) < 0)//如果孩子比tmp小
//                array[hole] = array[child];//交换值
//            else
//                break;
//        }
//        array[hole] = tmp;
//    }
//
//
//    public int left(int i) {
//        return (i + 1) * 2 - 1;
//    }
//
//    public int right(int i) {
//        return (i + 1) * 2;
//    }
//
//    public int parent(int i) {
//        // i为根结点
//        if (i == 0) {
//            return -1;
//        }
//        return (i - 1) / 2;
//    }
//    // 这个是大根堆的heapify
//    public <T> void heapify(T[] a, int i, int heapLength) {
//        int l = left(i);
//        int r = right(i);
//        int largest = -1;
//        // 大根堆的调整过程是三个元素进行调整的，一共是将最大的元素给找出来
//
//        /**
//         * 下面两个if条件句用来找到三个元素中的最大元素的位置largest；
//         * l < heapLength说明l在数组内，i非叶子结点；
//         */
//        if (l < heapLength && a[i].compareTo(a[l]) < 0) {
//            largest = l;
//        } else {
//            largest = i;
//        }
//        // r < heapLength说明r在数组内
//        if (r < heapLength && a[largest].compareTo(a[r]) < 0) {
//            largest = r;
//        }
//        // 如果i处元素不是最大的，就把i处的元素与最大处元素交换，交换会使元素下降
//        if (i != largest) {
//            T temp = a[i];
//            a[i] = a[largest];
//            a[largest] = temp;
//            // 交换元素后，以a[i]为根的树可能不在满足大根堆性质，于是递归调用该方法
//            heapify(a, largest, heapLength);
//        }
//    }
//
//
//    // Test program
//    public static void main(String[] args) {
//        int numItems = 10;
//        BinaryHeap h = new BinaryHeap(numItems);
//        int i = 37;
//
//        try {
//            for (i = 37; i != 0; i = (i + 37) % numItems){
//                h.insert(i);
//            }
//
//            for (int j=1;j<=h.currentSize;j++){
//                System.out.print(h.array[j]+" ");
//            }
//
//            System.out.println("\n"+h.findMin());
//            h.deleteMin();
//            for (int j=1;j<=h.currentSize;j++){
//                System.out.print(h.array[j]+" ");
//            }
//        } catch (Exception e) {
//            System.out.println("Overflow (expected)! " + i);
//        }
//    }
//
//    @Override
//    public int compareTo(T o) {
//        return 0;
//    }
//}
//
