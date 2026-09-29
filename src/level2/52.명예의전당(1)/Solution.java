import java.util.PriorityQueue;

public class Solution {
    public static int[] solution(int k, int[] score) {
        Queue<Integer> pq = new PriorityQueue<>();

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            pq.offer(score[i]);

            if(pq.size()>k)
                pq.poll();

            answer[i] = pq.peek();
        }
        
        return answer;
    }

    public static void main(String[] args) {
        int[] score = {10,100,20,150,1,100,200};
        int[] answer = Solution.solution(3, score);
        System.out.println(Arrays.toString(answer));
    }
}
