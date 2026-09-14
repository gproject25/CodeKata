import java.util.ArrayList;
import java.util.Arrays;


public class DescendingSort {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        while(n != 0){
            numbers.add((int) (n % 10));
            n /= 10;
        }    

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i) < numbers.get(j)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            answer = answer * 10 + numbers.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        DescendingSort descendingSort = new DescendingSort();
        System.out.println(descendingSort.solution(118372));
    }
}
