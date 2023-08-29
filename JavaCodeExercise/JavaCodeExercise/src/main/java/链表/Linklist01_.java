package 链表;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
//两个链表进行对比，每一个链表的元素都参与了对比
public class Linklist01_ {

    // 传入的是两个链表
    public static boolean compareLinkedLists(ListNode head1, ListNode head2){

        ListNode current1 = head1;
        ListNode current2 = head2;

        // 如果是一个链表是空的话，那么是停止继续往下走了
        while(current1.next!=null && current2 != null){
            if(current1.val!=current2.val) return false;
            current1=current1.next;
            current2=current2.next;
        }
        return true;
    }

}
