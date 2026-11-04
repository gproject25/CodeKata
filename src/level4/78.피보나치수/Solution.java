public class Solution {
        public int solution(int n) {
        return fibo(n);
    }    

    public int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(3));
    }
}
