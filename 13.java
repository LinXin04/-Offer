/*
从第二个数开始，遍历数组，如果遇到奇数，则遍历奇数之前的所有元素，如果遇到偶数就交换，一直交换到前面没有偶数为止。
*/
public class Solution {
    public void reOrderArray(int [] array) {
        if(array==null || array.length==0) return;
        
        for(int i=1;i<array.length;i++)
        {
            int temp=array[i];
            if(temp%2==1)
            {
                for(int j=i;j>0;j--)
                {
                    if(array[j-1]%2==0)
                    {
                        int n=array[j];
                        array[j]=array[j-1];
                        array[j-1]=n;
                    }
                }
            }
        }
    }
}