import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        //convert to days
        int todayDays = convertToDays(today);
        

        Map<Character, Integer> findTerms = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        for(String term : terms){
            String[] parts = term.split(" ");
            findTerms.put(parts[0].charAt(0), Integer.parseInt(parts[1]));
        }
        
        for(int i=0; i<privacies.length; i++){
            String[] parts = privacies[i].split(" ");
            int termPeriod = findTerms.get(parts[1].charAt(0));

            //convert to days
            int privacyDate = convertToDays(parts[0]);

           if(((termPeriod*28) + privacyDate) <= todayDays) {
                answer.add(i+1);
           }
        }

        int[] results = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            results[i] = answer.get(i);
        } 

        return results;
    }

    public int convertToDays(String date){
        String parts[] = date.split("\\.");

        //모든 달은 28일까지 있다고 가정
        int years = Integer.parseInt(parts[0]) * 12 * 28;
        int month = (Integer.parseInt(parts[1])-1) * 28;
        int days = Integer.parseInt(parts[2]);

        return (years + month + days);
    
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();    

        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        System.out.println(Arrays.toString(solution.solution(today, terms, privacies)));

    }
}
