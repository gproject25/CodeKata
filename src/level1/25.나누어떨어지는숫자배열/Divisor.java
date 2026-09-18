public class Divisor {
    public int[] solution(int[] arr, int divisor) {
        int[] temp = new int[arr.length];

        int count = 0;
        for(int i=0; i<arr.length; i++)
            if(arr[i]%divisor == 0){
                temp[count] = arr[i];
                count++;
            }    
        int[] answer = new int[count];
        for(int j=0; j<count; j++)
            answer[j] = temp[j];
        
        return answer;
    }    
    public static void main(String[] args) {
        Divisor divisor = new Divisor();
        int[] answer = divisor.solution(new int[]{5,9,7,10}, 5);
        System.out.println(answer[0] + " " + answer[1]);
    }
    
}
