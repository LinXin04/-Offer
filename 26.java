/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
//递归的思想
public class Solution {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return null;
        if(pRootOfTree.left==null && pRootOfTree.right==null) return pRootOfTree;
        
        //左链表和右链表
        TreeNode left=Convert(pRootOfTree.left);
        TreeNode right=Convert(pRootOfTree.right);
        
        //找到左链表中的最后一个节点
        TreeNode temp=left;
        while(temp!=null && temp.right!=null)
            temp=temp.right;
        
        //将左子树加在root前面
        if(temp!=null)
        {
            temp.right=pRootOfTree;
        	pRootOfTree.left=temp;
        }
        
        //将右子树加入root后边
        if(right!=null)
        {
            right.left=pRootOfTree;
            pRootOfTree.right=right;
        }
        return left==null?pRootOfTree:left;
    }
}