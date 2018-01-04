import java.util.ArrayList;
import java.util.Collections;
//字典序就是字母序，回溯法解决该问题
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result=new ArrayList<String>();
        if(str==null) return null;
        helper(result,0,str.toCharArray());
        Collections.sort(result);
        return result;
    }
    public void helper(ArrayList<String> result,int k,char[] s)
    {
        if(k==s.length-1)
        {
            String st=String.valueOf(s);
            if(!result.contains(st))
            	result.add(String.valueOf(st));
        }
        for(int i=k;i<s.length;i++)
        {
            swap(s,i,k);
            helper(result,k+1,s);
            swap(s,i,k);
        }
    }
    public void swap(char[] cs,int i,int j)
    {
        char temp=cs[i];
        cs[i]=cs[j];
        cs[j]=temp;
    }
}