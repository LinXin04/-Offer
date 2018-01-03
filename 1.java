public class Solution {
    public boolean Find(int target, int [][] array) {
		if(array==null || array.length==0) return false;
        int m=array.length;
        int n=array[0].length;
        
        for(int i=m-1,j=0;i>=0 && j<=n-1;)
        {
              if(target==array[i][j]) return true;
              else if(target<array[i][j]) {i--;}
              else {j++;}
        }
        return false;
    }
}