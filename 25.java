/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null) return pHead;
        
        //首先将所有的节点都复制一遍，并加在每个节点之后
        RandomListNode current=pHead;
        while(current!=null)
        {
            RandomListNode temp=new RandomListNode(current.label);
            temp.next=current.next;
            current.next=temp;
            current=temp.next;
        }
        
        //为所有新加的节点添加random
        current=pHead;
        while(current!=null)
        {
            RandomListNode temp=current.next;
            if(current.random!=null)
                temp.random=current.random;
            current=temp.next;
        }
        
        //将新的链表提取出来
        RandomListNode Nhead=pHead.next;
        current=pHead;
        while(current.next!=null)
        {
            RandomListNode temp=current.next;
            current.next=temp.next;
            current=temp;
        }
        return Nhead;
        //if(pHead==null) return pHead;
       // RandomListNode head=new RandomListNode(pHead.label);
        //head.next=pHead.next;
        //head.random=pHead.random;
        
        //head.next=Clone(pHead.next);
       // return head;
    }
}