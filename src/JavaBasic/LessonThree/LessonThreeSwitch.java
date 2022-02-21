package JavaBasic.LessonThree;

public class LessonThreeSwitch {
    public static void main(String[] args) {
//        String day = new String("SAT");
//        switch (day) {
//            case "MON":
//            case "TUE":
//            case "WED":
//            case "THU": System.out.println("Time to work");
//                break;
//            case "FRI": System.out.println("Nearing weekend");
//                break;
//            case "SAT":
//            case "SUN": System.out.println("Weekend!");
//                break;
//            default: System.out.println("Invalid day?");


        int i = 0;
        outer:
        while (i++ < 3) {
            int j = 0;
            while (j++ < 5) {
                if (j == 2) {
                    continue outer;
                }
                System.out.println("i = " + i + "; j = " + j);
            }
        }
    }
}
