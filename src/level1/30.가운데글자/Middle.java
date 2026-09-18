public class Middle {
    public String solution(String s) {
        int midindex2;
        int midindex = s.length()/2;
        char[] chars = s.toCharArray();
        char[] ans;
        
        if(s.length()%2 == 0){
            midindex2 = midindex - 1 ;
            ans = new char[2];
            ans[0] = chars[midindex2];
            ans[1] = chars[midindex];
        }
        else{
            ans = new char[1];
             ans[0] = chars[midindex];
        }

        
        String answer = new String(ans);
        return answer;
    }
    public static void main(String[] args) {
        Middle middle = new Middle();
        System.out.println(middle.solution("qwer"));
        System.out.println(middle.solution("abcde"));
    }
    
}
