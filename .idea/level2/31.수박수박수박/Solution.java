public class Solution {
    static public String solution(int n) {
        String answer = "";
        String pattern = "수박";

        for(int i=0; i<n; i++){
            int index = i%2;
            answer += pattern.charAt(index);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(3));
        System.out.println(Solution.solution(4));
        
    }
}
