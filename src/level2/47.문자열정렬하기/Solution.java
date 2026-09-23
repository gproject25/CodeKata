import java.util.Arrays;

public class Solution {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> { if (a.charAt(n) != b.charAt(n)) { return a.charAt(n) - b.charAt(n); } return a.compareTo(b); });
        return strings;
    }

    public static void main(String[] args) {
        String[] arr = {"sun","bed","car"};
        String[] answer = Solution.solution(arr,1);
        System.out.println(Arrays.toString(answer));
    }
}
