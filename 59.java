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
import java.util.Stack;
public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if(pRoot==null) return result;
        //定义层次
        int layer=1;
        //定义两个Stack分别存储奇数层和偶数层的节点
        Stack<TreeNode> stack1=new Stack<TreeNode>();
        stack1.push(pRoot);
        Stack<TreeNode> stack2=new Stack<TreeNode>();
        
        while(!stack1.empty() || !stack2.empty())
        {
            //偶数层
            if(layer%2!=0)
            {
                ArrayList<Integer> tmp=new ArrayList<Integer>();
                while(!stack1.empty())
                {
                    TreeNode node=stack1.pop();
                    if(node!=null)
                    {
                        tmp.add(node.val);
                        stack2.push(node.left);
                        stack2.push(node.right);
                    }
                }
                if(!tmp.isEmpty())
                {
                    result.add(tmp);
                    layer++;
                }
            }
            //奇数层
            else
            {
                ArrayList<Integer> tmp=new ArrayList<Integer>();
                while(!stack2.empty())
                {
                    TreeNode node=stack2.pop();
                    if(node!=null)
                    {
                        tmp.add(node.val);
                        stack1.push(node.right);
                        stack1.push(node.left);
                    }
                }
                 if(!tmp.isEmpty())
                {
                    result.add(tmp);
                    layer++;
                }
            }
        }
        return result;
    }
}