package 链表;



//相交的链表
public class Linklist02_ {

    // 两个链表来寻找相交的链表元素
    public static ListNode getIntersectionNode(ListNode head1,ListNode head2){
        ListNode pA=head1;
        ListNode pB=head2;
        while (pA!=pB){
            pA=pA==null?pB:pA.next;
            pB=pB==null?pA:pB.next;
        }
        return pA;
    }
}
