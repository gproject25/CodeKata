import java.util.Arrays;

public class Solution {
    public int[] solution(String[] wallpaper) {
        int maxY = 0;
        int minY = wallpaper.length-1;

        int maxX = 0;
        int minX = wallpaper[0].length()-1;

        for(int i=0; i<wallpaper.length; i++){

            for(int j=0; j<wallpaper[i].length(); j++){
                char c = wallpaper[i].charAt(j);
                if(c == '#'){
                    if(i < minY)
                        minY = i;
                    if(i > maxY)
                        maxY = i;
                    if(j < minX)
                        minX = j;
                    if(j > maxX)
                        maxX = j;
                }
            }
        }

        int[] answer = { minY, minX, maxY+1, maxX+1};

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.solution(new String[]{".#...", "..#..", "...#." })));
        System.out.println(Arrays.toString(solution.solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."})));
    }
}
