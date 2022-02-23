package JavaBasic.LessonThree;

import java.util.Scanner;

public class FindMaxInSeq {

    public static int max() {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();

        int number = max;
        if (max == 0) {
            return max;
        }
        while (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number == 0) break;
            if (max < number) max = number;
        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}

