public class Solution {
    public static int solution(String s) {
        
        String result = "";
        String sbset = "";


        char[] c = s.toCharArray();
        for(int i=0; i<c.length; i++){
            if(Character.isDigit(c[i])){
                result += c[i];
            }
            else{
                sbset += c[i];
                if(sbset.equals( "one")){
                    result += "1";
                    sbset = "";
                }    
                else if(sbset.equals( "two")){
                    result += "2";
                    sbset = "";
                }    
                else if(sbset.equals( "three")){
                    result += "3";
                    sbset= "";
                }    
                else if(sbset.equals( "four")){ 
                    result += "4";
                    sbset = "";
                }    
                else if(sbset.equals( "five")){
                    result += "5";
                    sbset = "";
                }    
                else if(sbset.equals( "six")){
                    result += "6";
                    sbset = "";
                }    
                else if(sbset.equals( "seven")){
                    result += "7";
                    sbset = "";
                }    
                else if(sbset.equals( "eight")){
                    result += "8";
                    sbset = "";
                }    
                else if(sbset.equals( "nine")){
                    result += "9";
                    sbset = "";
                }    
                else if(sbset.equals( "zero")){
                    result += "0";
                    sbset = "";
                }    
            }
        }
        
        int answer = Integer.parseInt(result);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Solution.solution("one4seveneight"));
        System.out.println(Solution.solution("23four5six7"));
    }
    
}
