class Solution {
    public static int solution(int n) {
        String result = "";

        while (n > 0) {
            result += n%3;
            n /= 3;
        }

        int answer = Integer.parseInt(result, 3);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(45));
        
    }
}