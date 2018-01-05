public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
    	if(n<=0) return 0;
        int count=0;
        
        for(int i=1;i<=n;i*=10)
        {
            int a=n/i; 
            int b=n%i;
            if(a%10==1)
            	count=count+(a+8)/10*i+(a%10)*(b+1);
            else
                count=count+(a+8)/10*i;
        }
        return count;
    }
}