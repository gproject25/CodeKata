public class PhoneNumber {
    public String solution(String phone_number) {

        char[] chars = phone_number.toCharArray();
        int count = 4;
        for(int i=chars.length-1; i>=0; i--){
            if(count <= 0)
                chars[i] = '*';
            count--;
        }
        String answer = new String(chars);

        return answer;
    }

    public static void main(String[] args) {
        PhoneNumber phoneNumber = new PhoneNumber();
        System.out.println(phoneNumber.solution("01033334444"));
        System.out.println(phoneNumber.solution("027778888"));
    }
    
}
