package JavaBasic.LessonThree;

import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();
        if (numberOfPeople > 0) {
            String name[] = new String[numberOfPeople];
            for (int i = 0; i <= numberOfPeople-1; i++) {
                Scanner scannerName = new Scanner(System.in);
                name[i] = scannerName.nextLine();
            }
            for (int i = 0; i <= numberOfPeople-1; i++) {
                System.out.println("Hello, " + name[i]);
            }
        } else if (numberOfPeople == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else {
            System.out.println("Seriously? Why so negative?");
        }

    }
}
