package JavaBasic.LessonThree;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speedSnailInTheAfternoon  = scanner.nextInt();
        int speedSnailAtNight  = scanner.nextInt();
        int heightTree = scanner.nextInt();
        if (speedSnailInTheAfternoon>speedSnailAtNight){
        int numberOfDays = (heightTree-speedSnailInTheAfternoon)/(speedSnailInTheAfternoon-speedSnailAtNight)+1;
        System.out.println(numberOfDays);
        }else {
            System.out.println("Impossible");
        }
    }
}
