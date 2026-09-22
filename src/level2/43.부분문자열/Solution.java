public class Solution {

    static int lengthP;
    static int lengthT;
    static int answer;
    static int pNum;

    public static int solution(String t, String p) {
        answer = 0;
        lengthP = p.length();
        lengthT = t.length();
        pNum = Integer.parseInt(p);
        subset(0,t.toCharArray());

        return answer;
    }    

    public static void subset(int index, char[] c){ 
        if(index>lengthT-lengthP){
            return;
        }


        char[] result = new char[lengthP];
        int ri = 0;

        for(int i=index; i<index+lengthP; i++){
            result[ri++] = c[i];
        }

        int number = Integer.parseInt(new String(result));
        if(number <= pNum) answer++;
        
        subset(index+1, c);
    }
    

    public static void main(String[] args) {
        System.out.println(Solution.solution("3141592","271"));
        System.out.println(Solution.solution("500220839878","7"));
    }
}
