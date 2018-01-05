import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       //维护两个指针
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if(sum<=1) return result;
        
        int low=1,high=2;
        while(low<high)
        {
            int curSum=(high-low+1)*(high+low)/2;
            if(curSum>sum)
                low++;
            else if(curSum<sum)
                high++;
            else
            {
                ArrayList<Integer> tmp=new ArrayList<Integer>();
                for(int i=low;i<=high;i++)
                    tmp.add(i);
                result.add(tmp);
                low++;
                high++;
            }
        }
        return result;
    }
}