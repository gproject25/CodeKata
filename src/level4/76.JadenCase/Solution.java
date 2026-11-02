public class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        String[] words = s.split(" ");
        for(int i=0; i<words.length; i++){
            String word = words[i];
            for(int j=0; j<word.length(); j++){
                char c = word.charAt(j);
                if(Character.isLetter(c)){
                    if(j==0){
                        c = Character.toUpperCase(c);
                    }
                    else{
                        c = Character.toLowerCase(c);
                    }
                }

                answer.append(c);
            }
            answer.append(" ");
        }

        return answer.toString();
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("3people unFollowed me"));
    }
}
