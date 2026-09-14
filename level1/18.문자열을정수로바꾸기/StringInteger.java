public class StringInteger {
    public int solution(String s) {
        int answer = 0;
        char ch1 = s.charAt(0);
        int start = 0;
        int sign = 1;

        if(ch1 == '+' || ch1 == '-'){
            start = 1;
            if(ch1 == '-')
                sign = -1;
        }    

        for (int i = start; i < s.length(); i++) {
            answer = answer * 10 + (s.charAt(i) - '0');
        }

        return answer*sign;
    }    

    public static void main(String[] args) {
        StringInteger stringInteger = new StringInteger();
        System.out.println(stringInteger.solution("-1234"));
    }
    
}
