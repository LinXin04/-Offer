import java.util.Arrays;
public class Solution {
    private int[] count=new int[256];
    String s="";
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        if(count[ch]==0)
            count[ch]=1;
        else
            count[ch]++;
        s+=ch;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	for(int i=0;i<s.length();i++)
        {
            char temp=s.charAt(i);
            if(count[temp]==1) return temp;
        }
        return '#';
    }
}