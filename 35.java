/*
本质是归并排序。
但是需要注意的是中间对于count的处理，要实时对其进行除余，防止越界
*/
public class Solution {
    public int InversePairs(int [] array) {
        if(array==null || array.length<=0) return 0;
        int n=array.length;
        
        int copy[]=new int[n];
        for(int i=0;i<n;i++)
            copy[i]=array[i];
        return helper(array,copy,0,n-1);
    }
    
    public int helper(int[] array,int[] copy,int start,int end)
    {
        if(start==end) return 0;
        int count=0;
        int mid=start+(end-start)/2;
        int leftCount=helper(array,copy,start,mid)%1000000007;
        int rightCount=helper(array,copy,mid+1,end)%1000000007;
        int i=mid;
        int j=end;
        int local=end;
        while(i>=start && j>mid)
        {
            if(array[i]>array[j])
            {
                count+=j-mid;
                if(count>=1000000007)
                    count=count%1000000007;
                copy[local--]=array[i--];
            }
            else
            {
                copy[local--]=array[j--];
            }
        }
        
        for(;i>=start;i--)
            copy[local--]=array[i];
        for(;j>mid;j--)
            copy[local--]=array[j];
        for(int s=start;s<=end;s++)
            array[s]=copy[s];
       return (leftCount+rightCount+count)%1000000007;
    }
}