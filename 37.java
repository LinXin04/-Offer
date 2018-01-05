public class Solution {
    public int GetNumberOfK(int [] array , int k) {
       //这道题目一看到是有序数组，第一反应应该是二分查找。主要思路就是先找到第一个k出现的下标，在找到最后一个k出现的下标，二者相减加1得到结果。
        if(array==null || array.length<=0) return 0;
        int n=array.length;
        int left=findFirst(array,k,0,n-1);
        int right=findLast(array,k,0,n-1);
        if(left!=-1 && right!=-1)
            return right-left+1;
        return 0;
    }
    
    //找到第一次出现的位置
    public int findFirst(int []array,int k, int start,int end)
    {
        if(start>end) return -1;
        int mid=start+(end-start)/2;
        if(array[mid]==k)
        {
            if(mid==start || array[mid-1]!=k)
                return mid;
            else end=mid-1;
        }else if(array[mid]>k)
            end=mid-1;
        else
            start=mid+1;
        return findFirst(array,k,start,end);
    }
    
    //找到最后一次出现的位置
    public int findLast(int []array,int k,int start,int end)
    {
        if(start>end)return -1;
        int mid=start+(end-start)/2;
        if(array[mid]==k)
        {
            if(mid==end || array[mid+1]!=k)
                return mid;
            else
                start=mid+1;
        }else if(array[mid]>k)
            end=mid-1;
        else
            start=mid+1;
        return findLast(array,k,start,end);
    }
}