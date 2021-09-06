package az.company.java_lessons.lesson_8.warmup;

import java.util.Scanner;

public class SimpleAndComplexNumbers {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("==========> WELCOME TO THE APPLICATION ! <==========");
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int digits = 0;
        String result = "";

        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0)
                digits++;
        }

        // write your code here
        // if number is simple then result must be "SIMPLE"
        // if number is complex result must be "COMPLEX"
        // ....

        System.out.println(result);
        System.out.println("==========> Good bye ! <==========");
    }
}
