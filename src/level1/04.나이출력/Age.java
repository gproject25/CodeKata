public class Age {
    public int solution(int age){
        return 2022-age+1;
    }

    public static void main(String[] args) {
        Age age = new Age();
        int inputage = 40;

        System.out.println("2022년 기준" + inputage + "살이므로 " + age.solution(40) + "년생입니다.");
    }
}
