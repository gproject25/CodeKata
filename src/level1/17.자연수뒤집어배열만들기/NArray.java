import java.util.ArrayList;
import java.util.Arrays;

public class NArray {
    public int[] solution(long n) {

        ArrayList<Integer> list = new ArrayList<>();

    
        while(n!= 0){
             list.add((int) (n % 10));
            n /= 10;
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        NArray nArray = new NArray();
        System.out.println(Arrays.toString(nArray.solution(12345)));
    }
    
}
