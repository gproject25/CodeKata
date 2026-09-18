class Solution {
    public static int[] solution(int n, int m) {
        int n1 = n;
        int m1 = m;

        while(m1 != 0) {
            int temp = n1%m1;
            n1 = m1;
            m1 = temp;
        }

        int gcd = n1;
        int lcm = (n*m)/gcd;

        return new int[] {gcd, lcm};
    }

    public static void main(String[] args) {
        int[] answer = Solution.solution(3,12);
        System.out.println(answer[0] + " " + answer[1]);
    }
}