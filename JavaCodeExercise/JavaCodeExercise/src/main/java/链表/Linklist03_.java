package 链表;


import java.util.List;

// 反转链表,链表的最后的位置是指向null的
public class Linklist03_ {


    public  static void reverseList(ListNode head){



        ListNode current=head;
        ListNode preNode=null;
        while(current.next!=null){
            ListNode next=current.next;
            current.next=preNode;
            preNode=current;
            current=next;

        }

    }
}
