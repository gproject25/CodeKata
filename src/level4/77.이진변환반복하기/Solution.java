import java.util.Arrays;
public class Solution {
    public int[] solution(String s) {
        int deleted = 0;
        int count = 0;

        while (!s.equals("1")) {
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<s.length(); i++){
                char c = s.charAt(i);

                if(c == '0'){
                    deleted++;
                }
                else{
                    sb.append(c);
                }
            }

            s = Integer.toBinaryString(sb.length());
            count++;
        }
        
        return new int[]{count,deleted};
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution("110010101001")));
    }
}
