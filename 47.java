public class Solution {
    public int Sum_Solution(int n) {
        int result=(int) Math.pow(n,2)+n;
        //因为不能使用循环和判断，所以我们在这里判断递归的终止条件时使用逻辑与操作
        //boolean flag=(result>0) && ((result+=Sum_Solution(n-1))>0);
        return result>>1;
    }
}