public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if(str==null  && pattern==null) return true;
        if(str!=null  && pattern==null) return false;
        return help(str,pattern,0,0);
    }
    
    public boolean help(char[] str,char[] pattern,int stLow,int paLow)
    {
        int len1=str.length;
        int len2=pattern.length;
        
        //str到尾，pattern到尾，匹配成功
        if(stLow==len1 && paLow==len2) return true;
        //str没到尾，pattern到尾，匹配失败
        if(stLow!=len1 && paLow==len2) return false;
       
        //如果pattern的第二个字符是*
        if(paLow+1<len2 && pattern[paLow+1]=='*')
        {
            //第二个*表示前面的字符出现0次或者1次及以上
            if(stLow<len1 && (str[stLow]==pattern[paLow] || pattern[paLow]=='.'))
                return help(str,pattern,stLow,paLow+2) || help(str,pattern,stLow+1,paLow);
            else
                return help(str,pattern,stLow,paLow+2);
        }
        else
        {
             if(stLow<len1 && (str[stLow]==pattern[paLow] || pattern[paLow]=='.'))
                 return help(str,pattern,stLow+1,paLow+1);
             else
                 return false;
        }
    }
}