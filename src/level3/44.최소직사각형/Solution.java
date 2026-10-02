import java.util.Arrays;

public class Solution {
    public static int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for(int[] s : sizes){
            int maxValue = Math.max(s[0],s[1]);
            int minValue = Math.min(s[0], s[1]);

            if(maxValue > maxWidth)
                maxWidth = maxValue;
            if(minValue > maxHeight)
                maxHeight = minValue;
        }

        return maxWidth*maxHeight;
    }    

    public static void main(String[] args) {

        int[][] arr = {{60,50},{30,70},{60,30},{80,40}};
        int[][] arr2 = {{10,7},{12,3},{8,15},{14,7}, {5,15}};
        System.out.println(Solution.solution(arr));
        System.out.println(Solution.solution(arr2));
    }
}
