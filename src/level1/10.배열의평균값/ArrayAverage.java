public class ArrayAverage {
    public double solution(int[] numbers) {
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        double answer = (double) sum/numbers.length;
        return answer;
    }

    public static void main(String[] args) {
        ArrayAverage arrayAverage = new ArrayAverage();
        System.out.println(arrayAverage.solution( new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(arrayAverage.solution( new int[] {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));

    }
}
