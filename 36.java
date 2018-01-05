/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1==null || pHead2==null) return null;
        //第一个公共节点的特点：之后的所有节点都相同
        int len1=countLen(pHead1);
        int len2=countLen(pHead2);
        if(len1>len2)
            pHead1=forward(pHead1,len1-len2);
        else
            pHead2=forward(pHead2,len2-len1);
        
        while(pHead1!=null)
        {
            if(pHead1==pHead2) return pHead1;
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }
        return null;
    }
    //统计链表的长度
    public int countLen(ListNode head)
    {
        int len=0;
        while(head!=null)
        {
            len++;
            head=head.next;
        }
        return len;
    }
    //链表先走step步
    public ListNode forward(ListNode head,int step)
    {
        while(step!=0)
        {
            head=head.next;
            step--;
        }

        return head;
    }
}