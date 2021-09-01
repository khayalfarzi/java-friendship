package az.company.java_lessons.lesson_7;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Eded daxil edin: ");
        int eded = scanner.nextInt();

        if (eded > 0) {
            System.out.println("Daxil etdiyiniz eded musbetdir");
        } else if (eded < 0) {
            System.out.println("Daxil etdiyiniz eded menfidir");
        } else {
            System.out.println("Daxil etdiyiniz eded sifirdir");
        }
    }
}