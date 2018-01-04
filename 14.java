/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
/*
首先统计链表中元素的个数：count
顺序搜索。倒数第k个结点就是整数第count-k+1个元素。
*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null || k<=0) return null;
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(k>count) return null;
        
        ListNode result=head;
        for(int i=1;i<=count-k;i++)
        {
            result=result.next;
        }
        return result;
    }
}