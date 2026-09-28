import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!hashMap.containsKey(c)){
                answer[i] = -1;
            }
            else{
                answer[i] = i - hashMap.get(c);
            }

            hashMap.put(c, i);
        }

        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.solution("banana")));
    }
}
