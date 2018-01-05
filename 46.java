public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        //这是一个约瑟夫问题
        if(n<=0 || m<=0) return -1;
        if(n==1) return 0;
        return (LastRemaining_Solution(n-1,m)+m)%n;
    }
}