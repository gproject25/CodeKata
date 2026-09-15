public class Collatz {
    public int solution(long num) {
        int count = 0;

        while(count<500){
            if(num == 1)
                return count;
            if(num%2 == 0)
                num /= 2;
            else
                num = (num*3)+1;
            count++;
        }

        return -1;
    }    

    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        System.out.println(collatz.solution(6));
        System.out.println(collatz.solution(16));
        System.out.println(collatz.solution(626331));
        
    }
    
}
