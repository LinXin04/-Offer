public class Solution {
    public int StrToInt(String str) {
        if(str==null || str.length()<=0) return 0;
        int result=0;
        char []nums=str.toCharArray();
        //先判断符号
        boolean flag=true;
        if(nums[0]=='-')
            flag=false;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]=='-' || nums[i]=='+') continue;
            if(nums[i]<48 || nums[i]>57) return 0;
            result=result*10+(nums[i]-'0');
        }
        return flag?result:result*(-1);
    }
}