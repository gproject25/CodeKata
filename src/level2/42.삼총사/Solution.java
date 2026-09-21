class Solution {
    public static int solution(int[] arr, int start,int count, int total){
        if(count == 3)
            return total == 0? 1:0;

        int result = 0;

        for(int i=start; i<arr.length; i++){
            result += solution(arr,i+1, count+1, total+arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-2,3,0,2,-5};

        System.out.println(Solution.solution(arr,0,0,0));
        
    }
}