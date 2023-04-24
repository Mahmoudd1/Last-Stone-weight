import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>heap=new PriorityQueue<>(Collections.reverseOrder());
        for (int  stone : stones)
        {
            heap.add(stone);
        }
        int a=0,b=0;
        while(heap.size()>1)
        {
            a=heap.poll();
            b=heap.poll();
            if (a-b>0)
                heap.add(a-b);
        }
        if (heap.size()==0)
            return 0;
        return heap.peek();
    }
}
