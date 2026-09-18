public class Solution {
    public static boolean solution(String s) {
        boolean answer = false;

        char[] chars = s.toCharArray();

        for(char c : chars){
            if(Character.isDigit(c)){
                answer = true;
            }
            else
                return false;
        }

        return answer;
    }    
    public static void main(String[] args) {
        System.out.println(Solution.solution("a234"));
        System.out.println(Solution.solution("1234"));
    }
    
}
