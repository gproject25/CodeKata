public class SumAll {

    public long solution(int a, int b) {
        long answer = 0;

        for(int i=3; i<=b; i++){
            answer += i;
        }

        return answer;
    }    

    public static void main(String[] args) {
        SumAll sumAll = new SumAll();
        System.out.println(sumAll.solution(3,5));
        System.out.println(sumAll.solution(3,3));
    }
    
}
