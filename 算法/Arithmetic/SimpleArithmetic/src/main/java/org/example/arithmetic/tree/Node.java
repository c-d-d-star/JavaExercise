package org.example.arithmetic.tree;

public class Node {
    int idata;
    double fdata;
    Node leftChild;
    Node rightChild;

    public void display(){

    }
}

class tree {
    private static Node root;


    public Node find(int key) {
        Node current = root;// 首先是指向根节点
        while (current.idata != key) {
            //从左子树还是右子树找呢
            if (key < current.idata) current = current.leftChild;
            else current = current.rightChild;
            if (current == null) return null; // 这个是空树的情况，就是查找的树是空
        }
        return current;
    }

    public void insert(int id, double dd) {
        Node newNode = new Node();
        newNode.idata = id;
        newNode.fdata = dd;
        // 创建出来的节点进行赋值的操作
        if (root == null) root = newNode;
        else {
            Node current = root; // 一个用来遍历
            Node parent; // 一个用来赋值
            while (true) {
                parent = current;
                if (id < current.idata) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = newNode;
                    }
                } else {
                        current = current.rightChild;
                        if (current == null) {
                            parent.rightChild = newNode;
                        }
                }
            }
        }
    }


    // 找到最大最小的值
    public static Node minmum(){
        Node current,last;
        current=root;
        while(current!=null){
            last=current;
            current=current.leftChild;
        }
        // 最小节点是在左子树的根节点处
        return current;
    }


    // 删除树中的节点值
    /*
    * 删除节点值是有着三种情况的：
    * 1.删除的是节点值，不含有左右子树
    * 2.删除的节点值是包含左子树或者是右子树的
    * 3.删除的节点是包含左右子树的
    * */

    public boolean delete(int key){
        Node current=root;
        Node parent=root;
        boolean isLeftChild=true;

        // 查找的过程之后就没有指向根节点
        while(current.idata!=key){
            parent=current;
            // 如果没有进循环两者之间就会相差一个，正好是作为父亲节点出现的
            if(key<current.idata){
                isLeftChild=true;
                current=current.leftChild;
            }else{
                isLeftChild=false;
                current=current.rightChild;
            }
            if(current==null) return false;
        }

        // 这个是无左右孩子的情况
        if(current.leftChild==null&&current.rightChild==null){
           if(current==root) root=null; // 如果说是一个节点的树，删除就是将根节点置为null
           else if (isLeftChild) {
               parent.leftChild=null;
           }else parent.rightChild=null;
           // 删除只有一个子节点的
        } else if (current.rightChild==null) {
            if(current==root) root=current.leftChild;
            else if (isLeftChild) {
                parent.leftChild=current.leftChild;
            }else parent.rightChild=current.leftChild;
        } else if (current.leftChild==null) {
            if(current==root) root=current.leftChild;
            else if (isLeftChild) {
                parent.leftChild=current.rightChild;
            }else parent.rightChild=current.leftChild;
        }
        Node success=getSuccessor(current);
        if(current==root) root=success;
        else if (isLeftChild) parent.leftChild=success;
        else parent.rightChild=success;
        success.leftChild=current.leftChild;
        return true ;
    }
    // 要做的事情就是返回删除节点之后的后继节点是哪一个
    // 后继节点的找到的方法是唯一的
    /*
    * 1.如果是某一个节点的右孩子上有左子树，那么这个节点的后继节点在左子树最左边的节点上
    * 2，如果某一个节点上没有右孩子节点，那么这个节点的右孩子就是后继节点
    *
    *
    *
    * */
    private Node getSuccessor(Node delNode){
        Node successorParent =delNode;
        Node successor=delNode;
        Node current=delNode.rightChild;

        while(current!=null){
            successorParent=successor;
            // 率先赋值，然后就不动
            successor=current;
            current=current.leftChild;
        }
        if(successor!=delNode.rightChild){
            successorParent.leftChild=successor.rightChild;
            successorParent.rightChild=successor.rightChild;
        }
        return successor;
        // 首先找初始节点的右子树节点，关键字一定是比初始节点大的

    }
}
