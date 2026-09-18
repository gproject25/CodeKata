public class Remainder {
    public int solution(int n) {
        for (int x = 1; x < n; x++) {
            if (n % x == 1) {
                return x;
            }
        }

        return -1;
    }   
    public static void main(String[] args) {
        Remainder remainder = new Remainder();
        System.out.println(remainder.solution(10));
        System.out.println(remainder.solution(12));
    }
}
