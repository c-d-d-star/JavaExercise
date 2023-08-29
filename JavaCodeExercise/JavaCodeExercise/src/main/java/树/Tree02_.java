package 树;
// 判断是否是平衡二叉树
public class Tree02_ {

    public static boolean isBalance(TreNode root){
        if(root==null) return true;
        return helperRoot(root) !=-1;
    }

    private static int helperRoot(TreNode root) {
        if(root==null) return 0 ;
        int left=helperRoot(root.left);
        int right=helperRoot(root.right);
        if(left==-1||right==-1||Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        TreNode root = new TreNode(1);
        root.left = new TreNode(2);
        root.right = new TreNode(3);
        root.left.left = new TreNode(4);
        root.left.right = new TreNode(5);
        root.left.left.left = new TreNode(6);

        boolean isBalanced = isBalance(root);
        System.out.println("Is the tree balanced? " + isBalanced);
    }
}
