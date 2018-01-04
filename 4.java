/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*
二叉树最常用的算法就是递归。简洁方便。
前序：根左右
中序：左根右
利用这一性质，定义一个helper(int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn)：在该函数里分别定义子树的根，左子树、右子树
*/
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre==null || in==null) return null;
        return helper(pre,0,pre.length-1,in,0,in.length-1);
    }
    public TreeNode helper(int[]pre,int startPre,int endPre,int[]in,int startIn,int endIn)
    {
        if(startPre>endPre || startIn>endIn) return null;
        
        TreeNode root=new TreeNode(pre[startPre]);
        for(int i=startIn;i<=endIn;i++)
        {
            if(in[i]==pre[startPre])
            {
                root.left=helper(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
                root.right=helper(pre,startPre+i-startIn+1,endPre,in,i+1,endIn);
            }
        }
        return root;
    }
}