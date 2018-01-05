/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        //对于给定的节点，我们知道其中序遍历的下一个节点是右子树上最左边的一个节点；如果没有右子树，那么我们要访问该节点的父节点，如果父节点的左节点与当前节点相同则返回父节点，否则继续向前
        if(pNode==null) return null;
        TreeLinkNode node=pNode;
        if(node.right!=null)
        {
            node=node.right;
            while(node.left!=null)
                node=node.left;
            return node;
        }
        else
        {
            while(node.next!=null)
            {
                if(node.next.left==node) return node.next;
                else node=node.next;
            }
        }
        return null;
    }
}