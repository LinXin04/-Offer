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
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null) return false;
        
        return equalTree(root1,root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }
    public boolean equalTree(TreeNode root1,TreeNode root2)
    {
		//注意这两个条件
        if(root2==null ) return true;
        if(root1==null) return false;
        if(root1.val==root2.val)
        {
            return equalTree(root1.left,root2.left) && equalTree(root1.right,root2.right);
        }
        return false;
    }
}