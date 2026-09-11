public class Compare {
    public int solution(int num1, int num2){
        if(num1 == num2)
            return 1;
        else
            return -1;
    }
    
    public static void main(String[] args) {
        Compare compare = new Compare();
        System.out.println(compare.solution(2,3));
        System.out.println(compare.solution(11,11));
        
    }
}
