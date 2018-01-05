import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Solution {
    public String PrintMinNumber(int [] numbers) {
		if(numbers==null || numbers.length<=0) return "";
        ArrayList<Integer> num=new ArrayList<Integer>();
        for(int i:numbers)0
            num.add(i);
        
        //用Collections进行排序
        Collections.sort(num,new Comparator<Integer>()
                         {
                             public int compare(Integer st1,Integer st2)
                             {
                                 String t1=st1+""+st2;
                                 String t2=st2+""+st1;
                                 return t1.compareTo(t2);
                             }
                         });
            String result="";
            for(int i=0;i<num.size();i++)
                result+=num.get(i);
        return result;
    }
}