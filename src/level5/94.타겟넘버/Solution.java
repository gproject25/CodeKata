public class Solution {
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int index, int sum) {

        if(index == numbers.length){
            if(sum == target){
                return 1;
            }
            else{
                return 0;
            }
        }

        int add = dfs(numbers, target, index + 1, sum + numbers[index]);
        int subtract = dfs(numbers, target, index+1, sum - numbers[index]);

        return add + subtract;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] numbers = {1,1,1,1,1};
        int target = 3;

        System.out.println(s.solution(numbers, target));
    }
}
