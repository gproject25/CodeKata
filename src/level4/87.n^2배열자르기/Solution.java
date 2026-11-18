import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Solution {
    public int[] solution(int n, long left, long right) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < ((int)(right-left+1)); i++) {
            long index = left + i;
            answer.add((int)(Math.max(index / n, index % n) + 1));
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3,2,5)));
    }
}
