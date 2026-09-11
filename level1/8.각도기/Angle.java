public class Angle {
    public int solution(int angle){
        if(angle>0 && angle<90)
            return 1;
        else if(angle == 90)
            return 2;
        else if(angle>90 && angle<180)
            return 3;
        else if(angle == 180)
            return 4;
        else
            return 0;
    }

    public static void main(String[] args) {
        Angle angle = new Angle();
        System.out.println(angle.solution(70));
        System.out.println(angle.solution(91));
        System.out.println(angle.solution(180));

    }
}
