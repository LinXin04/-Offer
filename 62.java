/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    int index=0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null || k<=0) return null;
        //左子树遍历
        TreeNode node1=KthNode(pRoot.left,k);
        if(node1!=null) return node1;
        //根
        index++;
        if(index==k) return pRoot;
        //右子树
        TreeNode node2=KthNode(pRoot.right,k);
        if(node2!=null) return node2;
        
        return null;
    }
}