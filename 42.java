import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(array==null || array.length<=1) return result;
        int n=array.length-1;
        int low=0,high=n;
        
        while(low<high)
        {
            int curSum=array[low]+array[high];
            if(curSum>sum)
                high--;
            else if(curSum<sum)
                low++;
            else
            {
                result.add(array[low]);
                result.add(array[high]);
                return result;
            }
        }
        return result;
    }
}