public class FindString {
    public String solution(String[] seoul) {
        String answer = "김서방은 ";

        int loc = -1;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i] == "Kim" || seoul[i] == "kim")
                loc = i;
        }

        answer += loc + "에 있다";
        return answer;
    }    

    public static void main(String[] args) {
        FindString findString = new FindString();
        System.out.println(findString.solution(new String[] {"Jane", "Kim"}));
    }
}
