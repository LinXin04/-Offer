public class Solution {
    private boolean isBalance=true;
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null) return true;
        getDepth(root);
        return isBalance;
    }
    
    public int getDepth(TreeNode root)
    {
        if(root==null) return 0;
        int left=getDepth(root.left);
        int right=getDepth(root.right);
        
        if(Math.abs(left-right)>1)
            isBalance=false;
        return left>right?left+1:right+1;
    }
}