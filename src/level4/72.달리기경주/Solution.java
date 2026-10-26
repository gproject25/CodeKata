import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> position = new HashMap<>();
        for(int i=0;i<players.length; i++){
            position.put(players[i], i);
        }

        for(int i=0; i<callings.length; i++){
            int pos = position.get(callings[i]);

            String temp = players[pos];
            players[pos] = players[pos-1];
            players[pos-1] = temp;

            position.put(temp, pos-1);
            position.put(players[pos], pos);
        }
        

        return players;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();


        System.out.println(Arrays.toString(solution.solution(new String[] {"mumu", "soe", "poe", "kai", "mine"}, new String[] {"kai", "kai", "mine", "mine"})));
    }
}