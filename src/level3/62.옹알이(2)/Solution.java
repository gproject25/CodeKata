import java.util.Arrays;

public class Solution {

     public int solution(String[] babbling) {
        int answer = 0;

        String[] accepted = {"aya", "ye", "woo", "ma"};

        for(String s : babbling){
            if(recursive(s, 0, "", accepted)){
                answer++;
            }
        }

        return answer;
    }

    public boolean recursive(String word, int index, String previous, String[] accepted){
        if(index >= word.length()){
            //종료
            return true;
        }

        for (String s : accepted) {
            if (word.startsWith(s, index)) {

                if (s.equals(previous))
                    return false;


                return recursive(word, index + s.length(),s, accepted);
            }
        }            

        return false;
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(new String[] { "aya", "yee", "u", "maa"}));
        System.out.println(sol.solution(new String[] { "ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}
