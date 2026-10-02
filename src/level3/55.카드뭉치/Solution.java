public class Solution {
    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int i1 = 0;
        int i2 = 0;

        for(int i=0; i<goal.length; i++){
            if(i1<cards1.length && goal[i].equals(cards1[i1]))
                    i1++;
            else if(i2<cards2.length && goal[i].equals(cards2[i2]))
                    i2++;
            else
                return "No";
        }

        return "Yes";
    }
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(Solution.solution(cards1, cards2,goal));

        String[] cards3 = {"i", "water", "drink"};
        String[] cards4 = {"want", "to"};
        System.out.println(Solution.solution(cards3,cards4,goal));

    }
}
