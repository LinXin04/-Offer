public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence==null || sequence.length==0) return false;
        return helper(sequence,0,sequence.length-1);
    }
    
    public boolean helper(int[] array,int start,int end)
    {
        if(start>=end) return true;
        int i=end;
        //找右子树,这里注意i的值，如果用i的话会产生越界
        while(i>start && array[i-1]>array[end]) i--;
        //右子树已经都满足大于x，现在看左子树是否满足都小于x;
        for(int j=i-1;j>=start;j--)
        {
            if(array[j]>array[end]) return false;
        }
        return helper(array,start,i-1) && helper(array,i,end-1);
    }
}