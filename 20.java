import java.util.Stack;

public class Solution {

    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
        if(stack2.empty())
            stack2.push(node);
        else
        {
            if(stack2.peek()>node)
                stack2.push(node);
        }
    }
    
    public void pop() {
        int num=stack1.pop();
        if(num==stack2.peek())
        	stack2.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();
    }
}