import java.math.BigInteger;
public class Solution {
    public int Add(int num1,int num2) {
        BigInteger n1=new BigInteger(String.valueOf(num1));
        BigInteger n2=new BigInteger(String.valueOf(num2));
        return n1.add(n2).intValue();
    }
}