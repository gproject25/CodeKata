import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] answers) {
        int[] personA = {1,2,3,4,5};
        int[] personB = {2,1,2,3,2,4,2,5};
        int[] personC = {3,3,1,1,2,2,4,4,5,5};
        int scoreA = 0;
        int scoreB = 0;
        int scoreC = 0;

        for(int i=0; i<answers.length; i++){
            if(answers[i] == personA[i % personA.length]){
                scoreA++;
            }
            if(answers[i] == personB[i % personB.length]){
                scoreB++;
            }
            if(answers[i] == personC[i % personC.length]){
                scoreC++;
            }
        }
        
        int max = Math.max(scoreA, Math.max(scoreB, scoreC));
        int count = 0;

        if(scoreA == max) count++;
        if(scoreB == max) count++;
        if(scoreC == max) count++;

        int[] answer = new int[count];
        
        int j = 0;
        if (scoreA == max) { answer[j++] = 1; } 
        if (scoreB == max) { answer[j++] = 2; } 
        if (scoreC == max) { answer[j++] = 3; }

        return answer;
    }
    
    public static void main(String[] args) {
        int[] answer = Solution.solution(new int[] {1,2,3,4,5});
        int[] answer2 = Solution.solution(new int[] {1,3,2,4,2});
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.toString(answer2));
    }
}
