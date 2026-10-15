public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n+1];

    for (int i = 1; i <= n; i++) {
        clothes[i] = 1;
    }
    for (int student : lost) {
        clothes[student]--;
    }
    for (int student : reserve) {
        clothes[student]++;
    }

        for(int i=1; i<=n; i++){
            if(clothes[i] == 0) //도난당한 학생
            {
                if(i>1 && clothes[i-1] == 2) //바로 뒷번호의 학생
                {
                    clothes[i-1]--;
                    clothes[i]++;
                }
                else if(i<n && clothes[i+1] == 2) //바로 앞번호의 학생
                {
                    clothes[i+1]--;
                    clothes[i]++;
                }
            }
        }

        int answer = 0;
        for(int i : clothes){
            if(i>0)
                answer++;
        }


        return answer;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.solution(5,new int[] {2,4}, new int[] {1,3,5} ));
        System.out.println(solution.solution(5,new int[] {2,4}, new int[] {3} ));
        System.out.println(solution.solution(3,new int[] {3}, new int[] {1} ));
    }
}
