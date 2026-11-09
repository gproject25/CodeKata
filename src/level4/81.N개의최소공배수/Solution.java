public class Solution {
    public int solution(int[] arr) {
        int lcm = arr[0];

        for(int i=1; i<arr.length; i++){
            lcm = (lcm*arr[i])/(gcd(lcm,arr[i]));
        }

        return lcm;
    }

    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2,6,8,14};
        int[] arr2 = {1,2,3};
        System.out.println(solution.solution(arr));
        System.out.println(solution.solution(arr2));
    }
}
