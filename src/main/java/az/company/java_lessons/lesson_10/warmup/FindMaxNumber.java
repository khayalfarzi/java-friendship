package az.company.java_lessons.lesson_10.warmup;

import java.util.Scanner;

public class FindMaxNumber {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter third number: ");
        int third = sc.nextInt();

        System.out.printf("Maximum number is: %s",
                Math.max(Math.max(first, second), third));
    }
}
