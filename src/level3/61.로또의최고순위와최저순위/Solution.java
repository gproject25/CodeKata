import java.util.Arrays;
public class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int max = 0;
        int min = 0;

        for (int i = 0; i < lottos.length; i++) {

            if (lottos[i] == 0) {
                max++;
                continue;
            }

            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    max++;
                    min++;
                    break;
                }
            }
        }

        if(max>1)
            answer[0] = 7-max;
        else
            answer[0] = 6;

        if(min>1)
            answer[1] = 7-min;
        else
            answer[1] = 6;

        return answer;
    }
    public static void main(String[] args) {
        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = {31,10,45,1,6,19};

        System.err.println(Arrays.toString(Solution.solution(lottos,win_nums)));


    }
    
}
