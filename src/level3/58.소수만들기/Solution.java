public class Solution {
    public static int solution(int[] nums) {
        return recursive(nums,0, 0, 0);
    }

    public static int recursive(int[] arr, int count, int start, int sum){
        if (count == 3) {
            if(sum<=1)
                return 0;

            for(int i=2; i*i <= sum; i++)
            {
                if(sum%i ==0)
                    return 0;
            }
            return 1;
        }

        int answer = 0;

        for(int i=start; i<arr.length; i++){
            answer += recursive(arr, count+1, i+1, sum+arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution(new int[] {1,2,7,6,4}));
    }
}
