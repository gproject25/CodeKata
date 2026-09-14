public class Average {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        answer = (double) sum/arr.length;

        return answer;
    }    
    public static void main(String[] args) {
        Average average = new Average();
        System.out.println(average.solution(new int[] {1,2,3,4}));
    }
}
