import java.util.ArrayList;


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
import java.util.Queue;
import java.util.LinkedList;
public class Solution {
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if(pRoot==null) return result;
        Queue<TreeNode> que=new LinkedList<TreeNode>();
        que.add(pRoot);
        
        ArrayList<Integer> tmp=new ArrayList<Integer>();
        int start=0,end=1;
        while(!que.isEmpty())
        {
            TreeNode node=que.remove();
            tmp.add(node.val);
            start++;
            if(node.left!=null) que.add(node.left);
            if(node.right!=null) que.add(node.right);
            
            if(start==end)
            {
                start=0;
                end=que.size();
                result.add(tmp);
                tmp=new ArrayList<Integer>();
            }
        }
        return result;
    }
    
}