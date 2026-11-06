public class Solution {
    public int solution(int n, int a, int b)
    {
        int answer = 1;

        while(true){
            int nextRoundA = (a+1)/2;
            int nextRoundB = (b+1)/2;

            //같은 라운드인지 확인
            if(nextRoundA == nextRoundB){
                break;
            }


            //다음 라운드
            a = nextRoundA;
            b = nextRoundB;
            
            answer++;
        }
    
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(8,4,7));
    }
}
