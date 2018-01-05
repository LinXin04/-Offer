public class Solution {
    public boolean isContinuous(int [] numbers) {
        //潜规则：这5张牌中除了大小王之外不可以有重复的数字；这5个数字的max-min<5
		if(numbers==null || numbers.length<5) return false;
        int []temp=new int[14];
        int min=14;
        int max=-1;
        for(int i=0;i<numbers.length;i++)
        {
            temp[numbers[i]]++;
            //如果是大小王，则跳过
            if(numbers[i]==0) continue;
            //如果出现个数大于1个的数字，则返回false
            if(numbers[i]!=0 && temp[numbers[i]]>1) return false;
            if(numbers[i]<min)
                min=numbers[i];
            if(numbers[i]>max)
                max=numbers[i];
        }
        if(max-min<5) return true;
        else return false;
    }
}