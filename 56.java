/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
		if(pHead==null || pHead.next==null) return pHead;
        ListNode first=new ListNode(-1);
        first.next=pHead;
        
        ListNode pre=pHead;
        ListNode last=first;
        
        while(pre!=null && pre.next!=null)
        {
            if(pre.val==pre.next.val)
            {
                int value=pre.val;
                while(pre!=null && pre.val==value)
                    pre=pre.next;
                last.next=pre;
            }
            else
            {
                last=pre;
                pre=pre.next;
            }
        }
        return first.next;
    }
}