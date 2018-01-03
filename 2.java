public class Solution {
    public String replaceSpace(StringBuffer str) {
    	if(str==null || str.length()==0) return str.toString();
        //从前向后统计空格的数量
        int count=0;
        int old_length=str.length();
        for(int i=0;i<old_length;i++)
        {
            if(str.charAt(i)==' ') count++;
        }
        str.setLength(str.length()+2*count);
        //从后向前替换空格
        for(int i=old_length-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                str.setCharAt(i+2*count,str.charAt(i));
            }
            else
            {
                count--;
                str.setCharAt(i+2*count,'%');
                str.setCharAt(i+2*count+1,'2');
                str.setCharAt(i+2*count+2,'0');
            }
        }
        return str.toString();
    }
}