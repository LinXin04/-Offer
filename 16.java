/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null || list2==null) return list1==null?list2:list1;
        ListNode head=null;
        ListNode current=null;
        
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                if(head==null)
                {
                    head=list1;
                    current=list1;
                }
                else
                {
                    current.next=list1;
                    current=current.next;
                }
                list1=list1.next;
            }
            else
            {
                if(head==null)
                {
                 	head=list2;
                    current=list2;
                }
                else
                {
                    current.next=list2;
                    current=current.next;
                }
                list2=list2.next;
            }
        }
        if(list1==null)
            current.next=list2;
        if(list2==null)
            current.next=list1;
        return head;
    }
}