import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(input==null || input.length<=0 || k>input.length) return result;
        
        heap_sort(input);
        for(int i=0;i<k;i++)
            result.add(input[i]);
        return result;
    }
    //建立堆
   public void build_heap(int[] input,int left,int right)
   {
       //取父节点
       int parent=input[left];
       //左子节点
       int child=left*2+1;
       
       while(child<=right)
       {
           //child为最大的孩子节点
           if(child+1<=right && input[child]<input[child+1])
               child=child+1;
           if(input[child]<=parent)
               break;
           input[left]=input[child];
           left=child;
           child=left*2+1;
       }
       input[left]=parent;
   }
    
    //堆排序
    public void heap_sort(int[] input)
    {
        //建立初始堆
        build_heap(input,0,input.length-1);
        //将第一个元素与最后个元素进行交换
        for(int i=input.length-1;i>0;i--)
        {
            int temp=input[i];
            input[i]=input[0];
            input[0]=temp;
            build_heap(input,0,i-1);
        }
    }

}