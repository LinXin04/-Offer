public class Solution {
    public boolean isNumeric(char[] str) {
        if(str==null || str.length<=0) return false;
        
        //该表达式最重要的几个元素：正负号、e/E、小数点
        //1、正负号只能出现在第一个或者e/E的后边
        //2、e/E不能出现在首或者尾部，不能有两个
        //3、.只能出现一次，并且有e/E的时候不可以出现
        //4、不可以出现其他无关的字符
        boolean flag=false, hasE=false, spot=false;
        int len=str.length;
        for(int i=0;i<len;i++)
        {
            if(str[i]=='+' || str[i]=='-')
            {
                //正负号只能出现在第一个或者e/E的后边
                if(i>0 && str[i-1]!='e' && str[i-1]!='E')
                    return false;
                flag=true;
             }else if(str[i]=='e' || str[i]=='E')
            {
                //不能同时存在两个
                if(hasE==true) return false;
                //不能位于首字符或尾字符
                if(i==0 || i==len-1) return false;
                hasE=true;
            }else if(str[i]=='.')
            {
                //不能同时存在两个小数点
                if(spot==true) return false;
                //有E存在不可以
                if(hasE==true) return false;
                spot=true;
            }else if(str[i]<'0' || str[i]>'9')
                return false;
            else continue;
        }
           return true;
    }
}