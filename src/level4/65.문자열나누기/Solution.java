
public class Solution {
    public int solution(String s) {
        int answer = 0;

        int i=0;
        while(i<s.length()){
            char x = s.charAt(i);
             i = recursive(i+1,s, 1, 0, x); //이동한 만큼 index update
             answer++;
        }

        return answer;
    }  
    
    public int recursive(int index, String s, int same, int different, char x){
        if(same == different || index >= s.length()){
            return index;
        }

        if(s.charAt(index) == x){
            same++;
        }
        else{
            different++;
        }
        return recursive(index+1, s, same, different, x);

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("banana"));
        System.out.println(s.solution("abracadabra"));
        System.out.println(s.solution("aaabbaccccabba"));
    
    }
}
