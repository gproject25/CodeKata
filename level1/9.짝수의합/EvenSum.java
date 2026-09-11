public class EvenSum {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++)
        {
            if(i%2 == 0)
                answer += i;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        EvenSum evenSum = new EvenSum();
        System.out.println(evenSum.solution(10));
        System.out.println(evenSum.solution(4));
        System.out.println(evenSum.solution(2));    
    }
}
