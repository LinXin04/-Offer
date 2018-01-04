import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
    	if(array==null || array.length==0) return 0;
        int start=0,end=array.length-1;
        
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(array[mid]>array[end])
                start=mid+1;
            //｛1，0，1，1，1｝ 和 ｛1，1， 1，0，1}。
            else if(array[mid]==array[end])
                end=end-1;
            else
            //{7,8,3,4,5}或者{1,2,3,4,5}
                end=mid;
        }
    return array[start];
}
}