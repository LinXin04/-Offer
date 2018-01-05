import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
		if(A==null || A.length<=0) return null;
        int len=A.length;
        int []B=new int[len];
        
        //计算矩阵的下三角
        B[0]=1;
        for(int i=1;i<len;i++)
            B[i]=B[i-1]*A[i-1];
        
        //计算矩阵的上三角
        int temp=1;
        for(int i=len-2;i>=0;i--)
        {
            temp*=A[i+1];
            B[i]*=temp;
        }
        
        return B;
    }
}