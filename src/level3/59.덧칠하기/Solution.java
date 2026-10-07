public class Solution {
    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int last = 0;
        
        for(int i=0; i<section.length; i++){
            if(section[i] > last){
                answer++;
                last = section[i] + m - 1;
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,3,6};

        System.out.println(Solution.solution(8,4, arr));
    }
}
