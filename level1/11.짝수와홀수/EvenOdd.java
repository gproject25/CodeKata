public class EvenOdd{
    public String solution(int num) {
        if(num%2 == 0)
            return "Even";
        else
            return "Odd";
    }    
    public static void main(String[] var0) {
      EvenOdd evenodd = new EvenOdd();
      System.out.println(evenodd.solution(3));
      System.out.println(evenodd.solution(4));
   }
}