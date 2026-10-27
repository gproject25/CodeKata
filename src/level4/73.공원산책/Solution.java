import java.util.Arrays;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int startX = 0;
        int startY = 0;

        //시작점
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    startX = i;
                    startY = j;
                }
            }
        }

        for(int i=0; i<routes.length; i++){
            String[] str = routes[i].split(" ");

            String dir = str[0];
            int dis = Integer.parseInt(str[1]);

            //(startX, startY)
            if(checkRoute(startX,startY,dir,dis,park)){
                if (dir.equals("N")) {
                    startX -= dis;
                } else if (dir.equals("E")) {
                    startY += dis;
                } else if (dir.equals("S")) {
                    startX += dis;
                } else if (dir.equals("W")) {
                    startY -= dis;
                }
            }
        }

        return new int[] {startX,startY};
    }

    public boolean checkRoute(int x, int y, String dir, int dis, String[] park){
        int nextX = x;
        int nextY = y;

        for (int i = 0; i < dis; i++) {
            if (dir.equals("N")) {
                nextX--;
            } else if (dir.equals("E")) {
                nextY++;
            } else if (dir.equals("S")) {
                nextX++;
            } else if (dir.equals("W")) {
                nextY--;
            }

            //Validate
            if (nextX < 0 || nextX >= park.length ||
                nextY < 0 || nextY >= park[0].length()) {
                return false;
            }
            if (park[nextX].charAt(nextY) == 'X') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};

        String[] park2 = {"OSO","OOO","OXO","OOO"};
        String[] routes2 = {"E 2","S 3","W 1"};
        
        System.out.println(Arrays.toString(solution.solution(park, routes)));
        System.out.println(Arrays.toString(solution.solution(park2, routes2)));
    }    
}