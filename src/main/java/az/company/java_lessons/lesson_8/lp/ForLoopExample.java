package az.company.java_lessons.lesson_8.lp;

import java.util.Scanner;

public class ForLoopExample {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        for (int i = 0; i <= number; i = i + 1) {
            System.out.println(i);
        }

        System.out.println("Program ended");
    }
}
