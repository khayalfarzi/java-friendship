package az.company.java_lessons.lesson_7;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Heftenin gununu daxil edin: ");
        int day = scanner.nextInt();

        // switch case
        switch (day) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
        }

        // if case
        if (day > 0 && day < 7) {

            if (day == 1)
                System.out.println("Monday");
            else if (day == 2)
                System.out.println("Thursday");
//        ...
            else System.out.println("Sunday");
        } else System.out.println("Daxil etdiyiniz eded heftenin gunu deyil");
    }
}
