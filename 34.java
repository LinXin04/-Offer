public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str==null || str.length()<=0) return -1;
        char ch[]=str.toCharArray();
        //注意有小写也有大写字母
        int count[]=new int['z'+1];
        
        for(char tmp:ch)
            count[(int) tmp]++;
        
        for(int i=0;i<ch.length;i++)
        {
            if(count[(int) ch[i]]==1) return i;
        }
        return -1;
    }
}