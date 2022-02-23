package JavaBasic.LessonThree;

import java.util.Scanner;

public class Average {

//    public static int averageValue() {
//        Scanner scanner = new Scanner(System.in);
//        int count = 0;
//        int symm = 0;
//        while (scanner.hasNextInt()) {
//            count++;
//            int number = scanner.nextInt();
//            symm = symm + number;
//            if (number == 0 && symm == 0) {
//                return 0;
//            }
//            if (number == 0) {
//                return symm / (count - 1);
//            }
//
//        }
//        return symm / count;
//    }

    public static void main(String[] args) {
//
//        System.out.println("Test your code here!\n");
//
//        // Get a result of your code
//
//        System.out.println(averageValue());
// good code
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int symm = 0;
        int number;
        do {
            count++;
            number = scanner.nextInt();
            symm += number;
        }while (number!=0);
        System.out.println(symm / (count - 1));

    }
}

