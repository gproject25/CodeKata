public class Solution {
    public static String solution(int a, int b) {

        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] countOfDays = {31,29,31,30,31,30,31,31,30,31,30,31};

        int totalDays = 0;
        for(int i=0; i<a-1; i++){
            totalDays += countOfDays[i];
        }
        totalDays += b;
        int offset = (totalDays-1)%7;

        //Jan 1 -> FRI
        String answer = days[(5 + offset) % 7];

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(5,24));
    }

}
