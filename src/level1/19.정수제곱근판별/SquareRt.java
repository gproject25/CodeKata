

public class SquareRt {
    public long solution(long n) {
        double factor = Math.sqrt(n);
        if(factor*factor == n){
            return (long) ((factor + 1) * (factor + 1));
        }

        return -1;
    }    
    public static void main(String[] args) {
        SquareRt squareRt =  new SquareRt();
        System.out.println(squareRt.solution(121));
        System.out.println(squareRt.solution(-1));
    }

}
