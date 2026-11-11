import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> tangerines = new HashMap<>();

        for(int t : tangerine){
            if(!tangerines.containsKey(t)){
                tangerines.put(t, 1);
            }
            else{
                int tcount = tangerines.get(t) + 1;
                tangerines.put(t,tcount);
            }
        }

        //sort
        List<Integer> counts = new ArrayList<>(tangerines.values());
        counts.sort(Comparator.reverseOrder());

        int answer = 0;
        int sum = 0;

        for (int count : counts) {
            sum += count;
            answer++;

            if (sum >= k) {
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(6, new int[] {1,3,2,5,4,5,2,3}));
    }
}