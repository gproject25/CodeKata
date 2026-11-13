import java.util.Stack;

public class Solution {
    public int solution(String s) {
        int answer = 0;

        for(int i=0; i< s.length(); i++){
            String rotate = s.substring(i) + s.substring(0,i);
            if(check(rotate)){
                answer++;
            }
        }


        return answer;
    }

private boolean check(String s) {
    Stack<Character> stack = new Stack<>();

    for (char c : s.toCharArray()) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
        } else {
            if (stack.isEmpty()) {
                return false;
            }
            char top = stack.peek();
            if ((c == ')' && top == '(') ||
                (c == ']' && top == '[') ||
                (c == '}' && top == '{')) {
                stack.pop();
            } else {
                return false;
            }
        }
    }
    return stack.isEmpty();
}
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("[](){}"));
        System.out.println(solution.solution("}]()[{"));
    }
}
