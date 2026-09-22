import java.util.Arrays;

public class Solution {
    public static String solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + n) % 26);
            } 
            else if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + n) % 26);
            }
            answer += c;
        }

        return answer;
    }

    public static void main(String[] args) {   
        System.out.println(Solution.solution("AB", 1));
        System.out.println(Solution.solution("a B z", 4));
        
    }
}