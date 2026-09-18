class Difference{
    public int solution(int num1, int num2){
        int answer = num1-num2;
        return answer;
    }

    public static void main(String[] args){
        Difference difference = new Difference();
        System.out.println(difference.solution(4,3));
    }
}