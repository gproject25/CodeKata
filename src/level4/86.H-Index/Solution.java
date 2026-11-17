import java.util.Arrays;
public class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i=citations.length-1; i>=0; i--){
            int n = citations.length-i;
            if(citations[i] >= answer){
                answer = n;
            }
            else{
                break;
            }
        }


        return answer;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{3,0,6,1,5}));
    }
}
