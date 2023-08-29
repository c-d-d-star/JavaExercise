package 树;

public class Tree03_ {
    public static int countTreeHight(TreNode root){
        if(root==null) return 0;
        int left=countTreeHight(root.left);
        int right=countTreeHight(root.right);
        return left+right+1;

    }
}
