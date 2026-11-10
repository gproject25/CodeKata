public class Solution {
    public long solution(int n) {
        int[] dp = new int[n + 1];

        dp[1] = 1;
        dp[2] = 2;

        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1234567;
        }

        return dp[n];
    }
    
    public static void main(String[] args) {
        
        Solution solution = new Solution();
        System.out.println(solution.solution(4));
        System.out.println(solution.solution(3));

    }
}
