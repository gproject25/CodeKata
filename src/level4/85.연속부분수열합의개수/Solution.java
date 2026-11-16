import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] elements) {
        Set<Integer> sums = new HashSet<>();


        for(int i=0; i<elements.length; i++) {
            int sum = 0;

            for(int j=0; j<elements.length; j++){
                int elementIndex = (i+j)%elements.length;
                sum += elements[elementIndex];
                sums.add(sum);
            }
        }

        return sums.size();
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{7,9,1,1,4}));
    }
}
