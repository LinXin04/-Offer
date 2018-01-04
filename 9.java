/*
f(n)=f(n-1)+f(n-2)+......+f(0)
f(n-1)=f(n-2)+.....f(0)
f(n)=2*f(n-1)
*/
public class Solution {
    public int JumpFloorII(int target) {
        if(target<=0) return 0;
        if(target==1) return 1;
        if(target==2) return 2;
        
        return 2*JumpFloorII(target-1);
    }
}