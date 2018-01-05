public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str==null || str.length()<=1 || n<=0) return str;
        int len=str.length();
        n=n%len;
        String result=str.substring(n,len)+str.substring(0,n);
        return result;
    }
}