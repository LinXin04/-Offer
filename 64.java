import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(num==null || num.length<=0 || size<=0 || num.length<size) return result;
        
        ArrayList<Integer> tmp=null;
        for(int i=0;i<num.length-size+1;i++)
        {
            tmp=new ArrayList<Integer>();
            for(int j=i;j<i+size;j++)
                tmp.add(num[j]);
            Collections.sort(tmp);
            result.add(tmp.get(size-1));
        }
        return result;
    }
}