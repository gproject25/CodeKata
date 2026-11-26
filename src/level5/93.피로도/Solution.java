public class Solution {
    int answer = 0;

    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k,dungeons,visited,0);
        return answer;
    }

    private void dfs(int k, int[][] dungeons, boolean[] visited, int count) {
        answer = Math.max(answer, count);
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i]) {
                continue;
            }
            if (k < dungeons[i][0]) {
                continue;
            }

            visited[i] = true;
            dfs(k - dungeons[i][1], dungeons, visited, count + 1);
            visited[i] = false;
        }
    }    
    
    public static void main(String[] args) {
        Solution s = new Solution();

        int[][] dungeons = {{80,20},{50,40},{30,10}};
        System.out.println(s.solution(80, dungeons));
    }
}
