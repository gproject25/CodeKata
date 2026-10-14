import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static String solution(String X, String Y) {
        String answer = "";

        //0-9 나타나는 수
        int[] XAmount = new int[10];
        int[] YAmount = new int[10];

        //count for X
        for(int i=0; i<X.length(); i++){
            char c = X.charAt(i);
            int digit = Character.digit(c, 10);
            XAmount[digit]++; 
        }

        //count for Y
        for(int i=0; i<Y.length(); i++){
            char c = Y.charAt(i);
            int digit = Character.digit(c, 10);
            YAmount[digit]++;
        }

        List<Integer> shareDigit = new ArrayList<>();

        for(int i=9; i>=0; i--){//내림차순으로 순회
            while(XAmount[i]>0 && YAmount[i]>0){
                shareDigit.add(i);
                XAmount[i]--;
                YAmount[i]--;
            }
        }

        //inter list 에서 string으로
        for(int i : shareDigit){
            if(shareDigit.get(0) == 0) //내림차순이므로 0이면 -> 공통된 숫자는 0으로만 구성되어있음
                return "0";

            answer += i;
        }
        if(shareDigit.size()>0)
            return answer;
        else
            return "-1";
    }   
    


    public static void main(String[] args) {
        System.out.println(Solution.solution("3403","13203"));
        System.out.println(Solution.solution("100","2345"));
        System.out.println(Solution.solution("100","203045"));
    }
}
