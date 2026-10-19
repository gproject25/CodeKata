public class Solution {
    public String solution(String s, String skip, int index) {

        //alphabet
        char[] alphabets = new char[26];
        for(int i=0; i<alphabets.length; i++){
            alphabets[i] = (char) ('a'+ i);
        }

        //skip
        for(int i=0; i<skip.length(); i++){
            char c = skip.charAt(i);
            int aindex = c - 'a';
            alphabets[aindex] = '-';
        }

        // { a, b ,c - , e ,f}
        // { a, b, c, e, f ,g}

        char[] skipAlphabets = new char[26-skip.length()];
        int j = 0;

        for (int i=0; i<skipAlphabets.length; i++) {
            while (alphabets[j] == '-') {
                j++;
            }

            skipAlphabets[i] = alphabets[j];
            j++;
        }

        //calculate answer
        char[] answer = new char[s.length()];
        for(int i=0; i<answer.length; i++){
            char c = s.charAt(i);

            int k;
            for(k=0; k<skipAlphabets.length; k++){
                if(c == skipAlphabets[k]){
                    break;
                }
            }

            answer[i] = skipAlphabets[(k + index) % skipAlphabets.length];
        }

        String result = new String(answer);

        return result;
    }    
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("aukks","wbqd",5));
    }
}
