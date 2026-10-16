import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {



    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        List<Map<Character, Integer>> list = new ArrayList<>();

        for(int i=0; i<keymap.length; i++){
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for(int j=0; j<keymap[i].length(); j++){
                char c = keymap[i].charAt(j);
                if(!map.containsKey(c))
                    map.put(c,j+1);
            }
            list.add(map);
        }

        for(int i=0; i<targets.length; i++){
            for(int j=0; j<targets[i].length(); j++){
                char target = targets[i].charAt(j);
                
                //find closest
                int closest = findClosest(list, target);
                answer[i] += closest;
            }
        }

        return answer;
    }

    public int findClosest(List<Map<Character, Integer>> list, char target){
        int closest = Integer.MAX_VALUE;

        for(int i=0; i<list.size(); i++){
            if(list.get(i).containsKey(target)){
                int location = list.get(i).get(target);
                if(location<closest)
                    closest = location;
            }
        }

        if(closest == Integer.MAX_VALUE)
            return -1;
        else
            return closest;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};

        String[] keymap2 = {"AA"};
        String[] targets2 = {"B"};

        String[] keymap3 = {"AGZ", "BSSS"};
        String[] targets3 = {"ASA","BGZ"};

        System.out.println(Arrays.toString(s.solution(keymap, targets)));
        System.out.println(Arrays.toString(s.solution(keymap2, targets2)));
        System.out.println(Arrays.toString(s.solution(keymap3, targets3)));                
    }
}
