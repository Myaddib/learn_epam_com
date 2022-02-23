package JavaBasic.LessonThree;

import java.util.Scanner;

public class FindMaxInSeq {
    public static void main(String[] args) {
        System.out.println(max());
    }

    static int max() {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int number;
        while (scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number == 0) break;
            if (max < number) max = number;
        }
        return max;
    }
}
