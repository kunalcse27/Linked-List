/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode deleteTail(ListNode head) {
        //your code goes here
        ListNode curr=head;
        if(head==null)
        {
           return null;
        }
        if(head.next==null)
        {
            return null;
        }
        else
        {
            while(curr.next.next!=null)
            {
                curr=curr.next;
            }
              curr.next=null;
        }
        return head;
    }
}
