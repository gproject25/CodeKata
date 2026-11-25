import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int count = 0;

        Queue<int[]> queue = new LinkedList<>();
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<priorities.length; i++){
            int[] order = {i, priorities[i]};
            queue.offer(order);
            pq.offer(priorities[i]);
        }
        
        while(!queue.isEmpty()){
            int[] processor = queue.poll();
            int priority = processor[1];
            int index = processor[0];

            if(priority < pq.peek()){
                queue.offer(processor);
            }
            else{
                count++;
                pq.poll();

                if (index == location) {
                    return count;
                }
            }
        }

        return count;
    }


    
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[] {2,1,3,2}, 2));
    }
}
