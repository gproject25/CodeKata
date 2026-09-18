public class PlaceSum {
    public int solution(int n) {
        int answer = 0;
    
        while(n>0){
            answer += n%10;
            n/= 10;
        }

        return answer;
    }    
    public static void main(String[] args) {
        PlaceSum placeSum = new PlaceSum();
        System.out.println(placeSum.solution(123));
    }
}
