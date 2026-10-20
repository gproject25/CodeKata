import java.util.Stack;

public class Solution {
    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<ingredient.length; i++){
            stack.push(ingredient[i]);

            int size = stack.size();

            if (size >= 4 && stack.get(size-4) == 1 && stack.get(size-3) == 2 && stack.get(size-2) == 3 && stack.get(size-1) == 1) {
                for (int j=0; j<4; j++) {
                    stack.pop();
                }

                answer++;
            }
        }

        return answer;
    }    

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int[] ingredient2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        
        System.out.println(Solution.solution(ingredient));
        System.out.println(Solution.solution(ingredient2));
    }
}
