public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array==null || array.length<=0) return 0;
        int n=array.length;
        int []dp=new int[n];
        dp[0]=array[0];
        int result=array[0];
        
        for(int i=1;i<n;i++)
        {
           dp[i]=Math.max(array[i],dp[i-1]+array[i]); 
           result=Math.max(dp[i],result);
        }
        return result;
    }
}