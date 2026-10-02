import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(numbers);


        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                if(!answer.contains(sum))
                    answer.add(sum);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] answer = Solution.solution(new int[]{2,1,3,4,1});
        System.out.println(Arrays.toString(answer));
    }
}
