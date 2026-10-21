public class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] scores = new int[8];

        for(int score : scores){
            score = 0;
        }

        for(int i=0; i<survey.length; i++){
            //index 결정
            int index1 = findIndex(survey[i].charAt(0));
            int index2 = findIndex(survey[i].charAt(1));

            //점수 계산
            if(choices[i]== 1)
                scores[index1] += 3;
            else if(choices[i] == 2)
                scores[index1] += 2;
            else if(choices[i] == 3)
                scores[index1] += 1;

            else if(choices[i] == 5)
                scores[index2] += 1;
            else if(choices[i] == 6)
                scores[index2] += 2;
            else if(choices[i] == 7)
                scores[index2] += 3;
        }

        for(int i=0; i<8; i+=2){
            int max = i;

            if(scores[i+1] > scores[i])
                max = i+1;

            char c = findType(max);
            answer = answer + c;
        }

        return answer;
    }

    public int findIndex(char c){
        if(c == 'R')
            return 0;
        else if(c == 'T')
            return 1;
        else if(c == 'C')
            return 2;
        else if(c == 'F')
            return 3;
        else if(c == 'J')
            return 4;
        else if(c == 'M')
            return 5;
        else if(c == 'A')
            return 6;
        else
            return 7;
    }

    public char findType(int index){
        char c;
        if(index == 0)
            c = 'R';
        else if(index == 1)
            c = 'T';
        else if(index == 2)
            c = 'C';
        else if(index == 3)
            c = 'F';
        else if(index == 4)
            c = 'J';
        else if(index == 5)
            c = 'M';
        else if(index == 6)
            c = 'A';
        else 
            c = 'N';
        return c;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5,3,2,7,5};
        System.out.println(solution.solution(survey, choices));
    }
    
}
