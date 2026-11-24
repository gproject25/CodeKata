import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();

        int maxDays = 0;
        int count = 0;
        for(int i=0; i<progresses.length; i++){
            int progressLeft = 100-progresses[i];
            int daysLeft = (progressLeft + speeds[i]-1)/speeds[i];

            if(daysLeft>maxDays){
                if(count>0){
                    answer.add(count);
                }
                
                maxDays = daysLeft;
                count = 1;
            } else{
                count++;
            }

        }
        answer.add(count);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] progress = {93,30,55};
        int[] speeds = {1,30,5};
    
        int[] progress2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(s.solution(progress,speeds)));
        System.out.println(Arrays.toString(s.solution(progress2,speeds2)));
    }    
}
