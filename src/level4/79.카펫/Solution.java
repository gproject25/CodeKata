import java.util.Arrays;

public class Solution {
    public int[] solution(int brown, int yellow) {
        
        //area = w*h = brown + yellow
        //brown = (w-2)(h-2) = yellow

        int total = brown + yellow;
        for(int h= 3; h<=Math.sqrt(total); h++){

            if(total % h == 0){ //w*h 검증
                int w = total/h;
                if((w-2) * (h-2) == yellow) //(w-2)(h-2) 검증
                {
                    return new int[] {w,h};
                }
            }
        }


        return new int[]{};
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(10,2)));
        System.out.println(Arrays.toString(solution.solution(8,1)));
    }
}
