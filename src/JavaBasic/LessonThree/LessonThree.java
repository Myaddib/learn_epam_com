package JavaBasic.LessonThree;

import java.time.LocalTime;
import java.util.Scanner;

public class LessonThree {
    public static void main(String[] args) {

        Scanner inNumber = new Scanner(System.in);
        System.out.print("Enter the number of seconds:");
        int intNumber = inNumber.nextInt();

        intNumber -= (intNumber / 86_400) * 86_400; // 24 hours a day * 60 minutes per hour *60 seconds per hour =86_400
        LocalTime conversionInTime = LocalTime.from(LocalTime.ofSecondOfDay(intNumber));
        System.out.println(conversionInTime);
    }
}
