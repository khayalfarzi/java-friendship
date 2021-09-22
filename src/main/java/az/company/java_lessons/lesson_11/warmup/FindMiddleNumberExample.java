package az.company.java_lessons.lesson_11.warmup;

import java.util.Scanner;

public class FindMiddleNumberExample {

    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the application...");

        String number = sc.next();
        System.out.println(
                findMiddleNumber(number)
        );

        System.out.println("Goodbye...");

    }

    // 3564567
    public static char findMiddleNumber(String number) {
        boolean isOdd = (number.length() % 2) == 1;

        char result;

        if (isOdd) {
            int index = ((number.length() / 2) + 1);
            result = number.charAt(index);
        } else result = 0;

        return result;
    }
}
