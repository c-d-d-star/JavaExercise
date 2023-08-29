
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0;
        ListNode current=head;
        while(current.next!=null){
            if(i==n){
                current=current.next.next;
            }
            i++;
        }
        return current;

    }
    public static void main(String[] args) {
        // 构建链表：1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();
        int n = 2;
        ListNode result = solution.removeNthFromEnd(head, n);

        // 输出链表的值：1 -> 2 -> 3 -> 5
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
    }
}