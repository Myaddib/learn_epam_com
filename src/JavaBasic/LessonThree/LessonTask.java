package JavaBasic.LessonThree;

import java.util.Scanner;

public class LessonTask {
    public static void main(String[] args) {
        final int password=133967;
        Scanner inNumber = new Scanner(System.in);
        System.out.print("Enter the password:");
        int inputPassword = inNumber.nextInt();
        if (inputPassword == password){
            System.out.println("Hello, Agent");
        }
        else{
            System.out.println("Access denied");
        }
    }
}
