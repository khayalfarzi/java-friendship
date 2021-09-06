package az.company.java_lessons.lesson_8.lp;

import java.util.Scanner;

public class WhileExample {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==========> WELCOME TO THE APPLICATION ! <==========");
        boolean key = true;

        while (key) {
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

            if (number == 0)
                result = "Number is 0";
            else if (digits <= 2)
                result = "SIMPLE";
            else result = "COMPLEX";

            System.out.println(result);

            boolean innerKey = true;
            while (innerKey) {
                System.out.print("Do you want to continue? (y/n) : ");
                String yn = sc.next();

                if (yn.equalsIgnoreCase("n")) {
                    key = false;
                    innerKey = false;
                } else if (yn.equalsIgnoreCase("y"))
                    innerKey = false;
                else
                    System.out.println("Input does not match any keyword (y/n) \n Please type correct keyword");
            }
        }

        System.out.println("==========> Good bye ! <==========");
    }
}
