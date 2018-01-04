/*
构建一个新的栈作为中间的介质，将pushA中的元素从头到尾一个个压入栈中，每压入一个数字，就判断pop中是否有与之相等的数，若有，则下标++且将栈中的元素弹出一个。最后判断栈是否是空即可
*/
import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
       if(pushA==null || popA==null) return false;
      
       int m=pushA.length;
       int n=popA.length;
       if(m!=n) return false;
        
       Stack<Integer> temp=new Stack<Integer>();
       for(int i=0,j=0;i<m;)
       {
           temp.push(pushA[i++]);
           while(j<n && temp.peek()==popA[j])
           {
               temp.pop();
               j++;
           }
       }
        return temp.empty();
    }
}