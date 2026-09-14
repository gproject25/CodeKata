public class Division2 {
    public int solution(int num1, int num2){
        if((num1>=100 || num1<0) || (num2>=100 || num2<0)){
            System.out.println("0부터 100 사이의 정수를 입력하세요!");
            return 0;
        }

        double answer = (double) num1/num2;
        return (int) (answer*1000);
    }

    public static void main(String[] args) {
        Division2 division2 = new Division2();

        System.out.println(division2.solution(3,2));
        System.out.println(division2.solution(7,3));
        System.out.println(division2.solution(1,16));
        
    }
}
