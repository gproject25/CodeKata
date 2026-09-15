public class Hashard {
    public boolean solution(int x) {
        int sum = 0;
        int n = x;

        while(n != 0){
            sum += n%10;
            n /= 10;
        }   

        if(x%sum == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Hashard hashard = new Hashard();
        System.out.println(hashard.solution(10));
        System.out.println(hashard.solution(12));
        System.out.println(hashard.solution(11));
        System.out.println(hashard.solution(13));
    }
    
}
