public class Solution {
    public String solution(String s) {
        String[] num = s.split(" ");
        
        int max = Integer.parseInt(num[0]);
        int min = Integer.parseInt(num[0]);

        for(int i=1; i<num.length; i++){
            int n =  Integer.parseInt(num[i]);
            
            if(n>max){
                max = n;
            }
            if(n<min){
                min = n;
            }
        }

        String answer =  min + " " + max;

        return answer;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("1 2 3 4"));
        System.out.println(solution.solution("-1 -2 -3 -4"));
        System.out.println(solution.solution("-1 1"));
    }
}
