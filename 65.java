public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
    	//定义一个boolean型的数组
        boolean []visited=new boolean[rows*cols];
        //从第i和j个开始匹配
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(help(matrix,rows,cols,i,j,str,visited,0))
                    return true;
            }
        }
        return false;
    }
    
    public boolean help(char[] matrix,int rows,int cols,int i ,int j,char[] str,boolean []visited,int index)
    {
        if(i<0 || i>=rows || j<0 || j>=cols || matrix[i*cols+j]!=str[index] || visited[i*cols+j]==true)
            return false;
        if(index==str.length-1) return true;
        visited[i*cols+j]=true;
        if(help(matrix,rows,cols,i-1,j,str,visited,index+1) || help(matrix,rows,cols,i+1,j,str,visited,index+1)
          || help(matrix,rows,cols,i,j-1,str,visited,index+1) || help(matrix,rows,cols,i,j+1,str,visited,index+1))
            return true;
        //如果没找到的话则回溯
        visited[i*cols+j]=false;
        return false;
    }
}