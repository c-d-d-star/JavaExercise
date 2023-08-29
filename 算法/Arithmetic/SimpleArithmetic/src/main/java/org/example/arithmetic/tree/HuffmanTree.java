package org.example.arithmetic.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree{
    public static void main(String[] args) {
        int arr[] ={3,6,15,20};
        Node1 huffmanTree = createHuffmanTree(arr);
        if (huffmanTree!=null){
            huffmanTree.preOrder();
        }
    }

    public static Node1 createHuffmanTree(int[] arr){
        // 创建一个集合，存入创建的节点
        List<Node1> nodeList = new ArrayList<Node1>();

        // 遍历集合将原始的数据放入到里面
        for (int item : arr) {
            nodeList.add(new Node1(item));
        }

        // 因为每次都会remove一些节点，最终会在list中剩下一个节点，这个节点就是根节点
        while (nodeList.size() > 1){
            // 从小到达排序list，排序是一直要做的事情
            Collections.sort(nodeList);

            // 取出前两个最小的，第一个作为左节点，第二个作为右节点
            // 经过排序之后就会产生有序的数组
            Node1 leftNode = nodeList.get(0);
            Node1 rightNode = nodeList.get(1);

            // 将权重+路径和赋值给父节点，将父节点的左右节点挂上
            Node1 parentNode = new Node1(leftNode.getValue()+rightNode.getValue());



            parentNode.setLeft(leftNode);
            parentNode.setRight(rightNode);

            // 移除最小的两个节点，将父节点放入list集合中，进行下一轮
            nodeList.remove(leftNode);
            nodeList.remove(rightNode);
            nodeList.add(parentNode);
        }
        // 返回最终的根节点
        return nodeList.get(0);
    }
}

class Node1 implements Comparable<Node1>{
    private int value;
    private Node1 left;
    private Node1 right;

    public Node1(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node1 getLeft() {
        return left;
    }

    public void setLeft(Node1 left) {
        this.left = left;
    }

    public Node1 getRight() {
        return right;
    }

    public void setRight(Node1 right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    // 从小到大排序
    @Override
    public int compareTo(Node1 node) {
        return this.value - node.value;
    }

    // 前序遍历
    public void preOrder(){
        System.out.println(this.toString());
        if (this.left!=null){
            this.left.preOrder();
        }
        if (this.right!=null){
            this.right.preOrder();
        }
    }
}

