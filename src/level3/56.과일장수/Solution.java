import java.util.Arrays;

public class Solution {
    public static int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int answer = 0;
        int count = 0;
        int size = score.length - 1;

        for(int i=size; i>=0; i--){
            if((++count) == m){
                answer += score[i] * m;
                count = 0;
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(Solution.solution(3,4, new int[] {1,2,3,1,2,3,1}));
    }
}
