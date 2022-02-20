package JavaBasic.LessonTwo;

public class LessonTwoThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));
        System.out.println(010 | 4);

        String s = "Hello";
        long l = 99;
        double d = 1.11;
        int i = 1;
        int j = 0;
        //j = i << s;
        j = i << j;
       // j = i << d;
        j = i << l;

        long x = 5;
        long y = 2;
       // byte b = (byte) x / y;
    }
}
