import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
     if(!stack2.isEmpty())
     {
         return stack2.pop();
     }
     else
     {
         while(!stack1.isEmpty())
         {
             int a=stack1.peek();
             stack1.pop();
             stack2.push(a);
         }
         return stack2.pop();
     }
    }
}