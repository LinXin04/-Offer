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
    int index=-1;
    String Serialize(TreeNode root) {
        //将给定的树前序遍历转换成字符，用，隔开
        StringBuffer st=new StringBuffer();
        if(root==null) 
        {
            st.append("#,");
            return st.toString();
        }
        st.append(root.val+",");
        st.append(Serialize(root.left));
        st.append(Serialize(root.right));
        return st.toString();
  }
    TreeNode Deserialize(String str) {
       //将给定的字符串反序列化为树
        index++;
        String []tmp=str.split(",");
        TreeNode root=null;
        if(!tmp[index].equals("#"))
        {
            root=new TreeNode(Integer.valueOf(tmp[index]));
            root.left=Deserialize(str);
            root.right=Deserialize(str);
        }
        return root;
  }
}