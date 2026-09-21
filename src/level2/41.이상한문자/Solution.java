
import java.util.Arrays;
class Solution {
    public static String solution(String s) {
        String answer = s;

        char[] c = answer.toCharArray();

        for(int i=0; i<c.length; i++){
            if(c[i] != ' '){
                if(i%2 == 0)
                    c[i] = Character.toUpperCase(c[i]);
                else
                    c[i] = Character.toLowerCase(c[i]);
                    
            }
        }

        
        return new String(c);

    }

    public static void main(String[] args) {
        System.out.println(Solution.solution("try hello world"));
    }
}