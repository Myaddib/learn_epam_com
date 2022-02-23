package JavaBasic.LessonThree;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkRestaurant = scanner.nextInt();
        if (checkRestaurant < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else {
            int numberOfFriends = scanner.nextInt();
            if (numberOfFriends <= 0) {
                System.out.println("Number of friends cannot be negative or zero");
            } else {
                int checkEquallyFriends = (checkRestaurant + (checkRestaurant / 10)) / numberOfFriends;
                System.out.println(checkEquallyFriends);
            }
        }

    }
}
