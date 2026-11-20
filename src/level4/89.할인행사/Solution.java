import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> target = new HashMap<>();
        Map<String, Integer> discountTotal = new HashMap<>();


        for(int i=0; i< want.length; i++){
            target.put(want[i], number[i]);
        }

        //10일간 각 상품 수
        for (int i = 0; i < 10; i++) {
            discountTotal.put(discount[i], discountTotal.getOrDefault(discount[i], 0) + 1);
        }
        if (matches(target, discountTotal)) answer++;

        for(int i=10; i<discount.length; i++){
            String out = discount[i - 10];
            discountTotal.put(out, discountTotal.get(out) - 1);


            String in = discount[i];
            discountTotal.put(in, discountTotal.getOrDefault(in, 0) + 1);

            if (matches(target, discountTotal)) answer++;
        }

        return answer;
    }

    public boolean matches(Map<String, Integer> target, Map<String, Integer> current){
        for(String key : target.keySet()) {
            if (current.getOrDefault(key, 0) < target.get(key)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        
        String[] want  = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3,2,2,2,1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(s.solution(want,number,discount));
    }
}
