import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> result=new ArrayList<Integer>();
       	if(matrix==null) return result;
        int row=matrix.length;
        int col=matrix[0].length;
        if(row==0 || col==0) return result;
        
        int left=0,top=0,right=col-1,bottom=row-1;
        while(left<=right && top<=bottom)
        {
            //从左到右
            for(int i=left;i<=right;i++) result.add(matrix[top][i]);
            //从上到下
            for(int i=top+1;i<=bottom;i++) result.add(matrix[i][right]);
            //从右到左
            if(top!=bottom)
                for(int i=right-1;i>=left;i--) result.add(matrix[bottom][i]);
            //从下到上
            if(left!=right)
                for(int i=bottom-1;i>top;i--) result.add(matrix[i][left]);
            left++;top++;right--;bottom--;
        }
        return result;
    }
}