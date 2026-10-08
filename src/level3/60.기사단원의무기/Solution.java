public class Solution {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){
            
            int count = 0;

            for(int j=i; j>0; j--){
                if(i%j == 0){
                    count++;
                }
            }

            if(count > limit)
                answer+= power;
            else{
                answer+= count;
            }
        }

        return answer;
    }    

    public static void main(String[] args) {
        System.out.println(Solution.solution(5,3,2));
        System.out.println(Solution.solution(10,3,2));
    }
}
