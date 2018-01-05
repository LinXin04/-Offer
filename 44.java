public class Solution {
    public String ReverseSentence(String str) {
        if(str==null || str.length()<=1) return str;
        
        String result="";
        String []tmp=str.split(" ");
        //如果全部都是空格的话返回str本身
        if(tmp==null || tmp.length==0) return str;
        
        for(int i=tmp.length-1;i>=0;i--)
        {
            result+=tmp[i];
            if(i!=0)
                result+=" ";
        }
        return result;
    }
}