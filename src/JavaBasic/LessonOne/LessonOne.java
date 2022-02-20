package JavaBasic.LessonOne;

import java.util.Scanner;

public class LessonOne {
    public static void main(String[] args) {

        // error -> println("Hello student!");
        System.out.println("Hello world!"); // -> Hello world!
        //Что означает иконка красного квадратика в консоли IDE?
        //Пиложение работаеть
//part1
        System.out.println("hello");
        System.out.print(42);
        System.out.println("\n\tjava " + 16);

//part2
        int x;
        try {
            x = System.in.read();
            System.out.println("code=" + x + " x=" + (char)x);
        } catch (Exception e) {
            e.printStackTrace();
        }
//part3
        Scanner scan= new Scanner(System.in);
        String input=scan.next();
        System.out.println("Hello "+input);
//part4
        int number=scan.nextInt();
        System.out.println("Number= "+number);

        Scanner scan1= new Scanner(System.in);
        String input1=scan1.nextLine();
        System.out.println("Hello, "+input1);

    }
}
