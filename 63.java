import java.util.PriorityQueue;
import java.util.Comparator;
public class Solution {
	//本题目使用两个堆结构，一个是大顶堆，一个是小顶堆。大顶堆中存放的元素全部小于小顶堆中存放的元素。这样的话中位数就只会在小顶堆的堆顶和大顶堆的堆顶中产生
    private int count=0;
    //默认是小顶堆
    private PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
    //大顶堆
    private PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(10,new Comparator<Integer>()
                                                                      {
                                                                          public int compare(Integer i,Integer j)
                                                                          {
                                                                              return j-i;
                                                                          }
                                                                      });
    public void Insert(Integer num) {
        //如果是偶数,将其加入小顶堆。进入小顶堆的元素要保证全部大于大顶堆的元素，因此要经过大顶堆一下在进入小顶堆
        if(count%2==0)
        {
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
        }
        else
        {
            minHeap.add(num);
            maxHeap.add(minHeap.poll());
        }
        count++;
    }

    public Double GetMedian() {
        if(count%2==0) 
            return new Double((minHeap.peek()+maxHeap.peek()))/2;
        else
            return new Double(minHeap.peek());
    }
}