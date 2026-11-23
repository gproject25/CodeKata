import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String,Integer> clothesType = new HashMap<>();
        for(String[] c : clothes){
            clothesType.put(c[1], clothesType.getOrDefault(c[1], 0)+1);
        }

        for(int count : clothesType.values()){
            answer = (count+1) * answer;
        }

        return answer-1;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();

        String[][] clothes = { {"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] clothes2 = { {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        
        System.out.println(s.solution(clothes));
        System.out.println(s.solution(clothes2));
    }
}
