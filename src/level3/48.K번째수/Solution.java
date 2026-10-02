import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int answeridx = 0;

        for(int idx=0; idx<commands.length; idx++){
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];
            int[] subset = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(subset);
            answer[answeridx++] = subset[k-1];
        }


        return answer;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,5,2,6,3,7,4};
        int[][] cmds = {{2,5,3}, {4,4,1}, {1,7,3}};
        int[] answer = Solution.solution(arr,cmds);
        System.out.println(Arrays.toString(answer));
    }
    
}
