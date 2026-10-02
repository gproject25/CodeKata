public class Solution {
    public static int solution(int a, int b, int n) {
        if(n<a)
            return 0;

        int half  = (b*n)/a;
        int remainder = (b*n)%a;

        return half + solution(a,b,half+remainder);
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(2,1,20));
        System.out.println(Solution.solution(3,1,20));

        }
}