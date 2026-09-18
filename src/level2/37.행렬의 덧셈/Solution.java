import java.util.Arrays;

class Solution {
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int N = arr1.length;
        int M = arr1[0].length;

        int[][] answer = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                answer[i][j ]= arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int [][] answer = Solution.solution(new int[][] {{1,2}, {2,3}}, new int[][] {{3,4},{5,6}});
        for(int [] n1 : answer){
            for(int n2 : n1){
                System.out.println(n2 +  " ");
            }
        }
    }
}