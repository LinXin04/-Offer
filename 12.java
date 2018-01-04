public class Solution {
    double result;
    public double Power(double base, int exponent) {
        if(base==0 || base==1) return base;
        if(exponent==0) return 1;
        int temp=Math.abs(exponent);
        if(exponent<0) return 1/helper(base,temp);
        else return helper(base,temp);
  }
    public double helper(double base, int exponent)
    {
        if(exponent%2==0)
            result=Power(base,exponent/2)*Power(base,exponent/2);
        else
            result=Power(base,exponent/2)*Power(base,exponent/2)*base;
        return result;
    }
}