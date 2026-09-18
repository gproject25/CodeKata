class Solution {
    public static long solution(int price, int money, int count) {
        long answer = 0;

        for(int i=1; i<=count; i++){
            answer += i*price;
        }

        answer -= money;

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Solution.solution(3,20,4));        
    }
}