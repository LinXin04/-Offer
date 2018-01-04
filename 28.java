/*
如果用排序的方法，复杂度为O(nlogn)
但是这个题目的最优解法的复杂度是O(n)
定一个times用于保存当前数字出现的次数，如果这个数字与前面的数字相等，times++,否则times--
同时还要注意最后判断你挑出来的这个总数最多的数字是不是大于总长度的一半
*/
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array==null || array.length<=0) return 0;
        int result=array[0];
        int times=1;
        
        for(int i=1;i<array.length;i++)
        {
            if(times==0)
            {
                result=array[i];
                times=1;
            }
            else
            {
                if(array[i]==array[i-1])
                    times++;
                else
                    times--;
            }
        }
        
        //最后确认一遍这个出现次数最多的数出现的总次数是否大于一半
        times=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==result) times++;
        }
        
        return times>array.length/2?result:0;
    }
}