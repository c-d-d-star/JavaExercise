package 树;




import javax.swing.tree.TreeNode;
import java.util.*;
class TreNode{
    TreNode left;
    TreNode right;
    int val;

    TreNode(){
    }
    TreNode(int a){
        this.val=a;
    }
}

public class Tree01_ {

     /*
        根节点 -> 左子树 -> 右子树
         二叉树的前序遍历
        */

//    public void infixTraversal(TreNode root){
//        if (root == null) {
//            return;
//        }
//        List<Integer> res = new ArrayList<>();
//        Deque<TreNode> stack = new LinkedList<>();
//        stack.push(root);
//        while (!stack.isEmpty()) {
//            TreNode current = stack.pop();
//            res.add(current.val); // 先访问根节点
//            // 注意入栈顺序，右子树先入栈，左子树后入栈，这样出栈的时候就是根节点->左子树->右子树的顺序
//            if (current.right != null) {
//                stack.push(current.right);
//            }
//            if (current.left != null) {
//                stack.push(current.left);
//            }
//        }



//    }

/*

    左子树 -> 根节点 -> 右子树
    二叉树中遍历
*/

    public void inOrderTraversalWithLoop(TreNode root){

        List<Integer> res=new ArrayList<>();
        Deque<TreNode> stack=new LinkedList<>();
        while(root!=null||!stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            // 此时的左子树全部被访问完了
            // 不仅是是左子树也是根节点
            stack.pop();
            res.add(root.val); // 这个里面是可以进行打印操作的


            root=root.right;

            //正常的弹栈的顺序是左---根---右
        }

    }


    /* 后序遍历
    左子树 -> 右子树 -> 根节点*/


    public void posOrderRecur(TreNode root){

        Stack<TreNode> stack=new Stack<>();
        List<Integer> res=new ArrayList<>();

        TreNode pressNode=null;
        while(root!=null||!stack.isEmpty()){
            while (root!=null){
                stack.push(root);
                root=root.left;
            }// 左边的节点已经全部压栈了


            root = stack.pop();
            if(root.right==null||root.right==pressNode){
                /*
                * root.right == pressNode 这个条件用于确定右子树是否已经被访问。
                * 在这个上下文中，pressNode 变量的作用是记录最后一个被访问的节点，以帮助控制遍历过程。
                  在后序遍历算法中，当我们访问一个节点的时候，我们会先递归地遍历它的左子树，然后再递归遍历它的右子树，最后才处理该节点本身。
                  * 所以，当我们回溯到父节点时，我们需要知道右子树是否已经遍历过。
                    如果 root.right == pressNode 为真，说明右子树已经被访问过或者为空，可以继续处理当前节点和向上回溯。
                    * 否则，右子树还没有被访问过，需要先处理右子树。
                    在这段代码中，当 root.right == pressNode 为真时，表示右子树已经被访问过或为空，
                    * 我们会将当前节点的值添加到结果列表 res，然后将 root 置为 null，从而回溯到父节点。
                    在接下来的迭代中，由于 root 已经是 null，我们将弹出栈顶节点并处理其右子树，完成了树的后序遍历。
                    * 这样，通过记录 pressNode，我们可以有效地控制树的遍历顺序，保证按照后序遍历的方式正确访问树的每个节点。

                * */
                res.add(root.val);  // 顺序就是在右子树这边
                pressNode=root;
                root=null;  // 这个里面为什么root要置为null

                /*
                *
                * if (root.right == null || root.right == pressNode)：这个条件检查当前节点root的右子树是否已经遍历完成。
                * 如果右子树要么是null，要么已经被访问过（由pressNode表示），那么意味着当前子树的所有节点都已经被处理过。

                    res.add(root.val)：这一行将当前节点root的值添加到一个列表（res）中。由于这段代码是用于后序遍历，这意味着节点的值将在遍历其左子树和右子树之后添加到列表中。

                    pressNode = root：pressNode是一个变量，用于记录最后访问的节点。它确保我们不会重复访问节点。在这里，pressNode被更新为root，表示我们已经完成了对当前节点及其子树的访问。

                    root = null：将root设置为null对于后序遍历过程至关重要。通过将root设置为null，我们实际上是在完成了对当前节点及其子树的遍历后，向上移动到父节点。这样，我们可以继续遍历父节点的右子树（如果有的话）。

                    后序遍历涉及按照左子树 -> 右子树 -> 根节点的顺序访问节点。在完成子树及其右子节点（如果有的话）的遍历后，将root设置为null，以便向上移动到父节点。这个过程一直重复，直到整棵树都被遍历完。

                * */

            }else {
                stack.push(root);
                root=root.right;
            }

        }
    }


    public static void main(String[] args) {

    }
}



class Solution {
    public List<Integer> inorderTraversal(TreNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreNode> stk = new LinkedList<TreNode>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }

    public static TreNode createTestTree() {
        TreNode root = new TreNode(1);
        root.left = new TreNode(2);
        root.right = new TreNode(3);
        root.left.left = new TreNode(4);
        root.left.right = new TreNode(5);
        return root;
    }

    public static void main(String[] args) {
        Solution  test = new Solution();
        TreNode root = createTestTree();
        List<Integer> result = test.inorderTraversal(root);
        System.out.println("Inorder Traversal Result: " + result);
    }

}

