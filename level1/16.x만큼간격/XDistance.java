import java.util.Arrays;
public class XDistance {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=1; i<=n; i++){
            answer[i-1] = x*i;
        }

        return answer;
    }

    public static void main(String[] args) {
        XDistance xDistance = new XDistance();
        System.out.println(Arrays.toString(xDistance.solution(2,5)));
        System.out.println(Arrays.toString(xDistance.solution(-4,2)));
    }
}
