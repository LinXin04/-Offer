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

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null || pHead.next==null) return null;
        
        //定义两个指针，p1和p2,p1每次走1步，p2每次走2步
        ListNode p1=pHead;
        ListNode p2=pHead;
        
        while(p2.next!=null && p2.next.next!=null)
        {
            p1=p1.next;
            p2=p2.next.next;
            
            //找到相交点
            if(p1==p2)
            {
                p2=pHead;
                while(p1!=p2)
                {
                    p1=p1.next;
                    p2=p2.next;
                }
                if(p1==p2)
                    return p2;
            }
        }
        return null;
    }
}