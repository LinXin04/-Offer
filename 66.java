public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
        //定义一个Boolean来表示i,j是否被访问过
        boolean [][] visited=new boolean[rows][cols];
        return help(threshold,rows,cols,0,0,visited);
    }
    //从i,j出发可以访问几个节点
    public int help(int threshold, int rows,int cols,int i,int j,boolean[][] visited)
    {
        if(i<0 || i>=rows || j<0 || j>=cols || visited[i][j] || sum(i)+sum(j)>threshold)
            return 0;
        visited[i][j]=true;
        return help(threshold,rows,cols,i-1,j,visited)+help(threshold,rows,cols,i+1,j,visited)+help(threshold,rows,cols,i,j-1,visited)+help(threshold,rows,cols,i,j+1,visited)+1;
    }
    public int sum(int num)
    {
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}