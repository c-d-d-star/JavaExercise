package 链表.找中间链表;

public class FindMidList {
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        // Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the linked list into two parts
        ListNode secondHalf = slow.next;
        slow.next = null;

        // Reverse the second half of the linked list
        ListNode prev = null, current = secondHalf, next;
        while (current != null) {
            next = current.next;   // 存储下一个节点
            current.next = prev;
            prev = current;
            current = next;
        }
        secondHalf = prev;

        // Merge the two halves
        ListNode first = head;
        while (secondHalf != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = secondHalf.next;
            first.next = secondHalf;
            secondHalf.next = temp1;
            first = temp1;
            secondHalf = temp2;
        }
    }
}




