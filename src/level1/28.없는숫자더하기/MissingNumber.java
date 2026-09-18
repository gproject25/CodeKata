public class MissingNumber {
    public int solution(int[] numbers) {
        int answer = 0;

        boolean[] verify = new boolean[10];

        for(int i=0; i<numbers.length; i++){
            verify[numbers[i]] = true;
        }

        for(int j=0; j<verify.length; j++){
            if(verify[j] == false)
                answer += j;
        }


        return answer;
    }
    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        System.out.println(missingNumber.solution(new int[]{1,2,3,4,6,7,8,0}));
    }
    
}
