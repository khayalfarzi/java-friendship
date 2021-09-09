package az.company.java_lessons.lesson_9.warmup;

import java.util.Scanner;

public class GenerateNxNMatrixExercise {

    /**
     * WELCOME TO THE APPLICATION!
     * Enter  row size: 3
     * Enter column size: 3
     * <p>
     * Your NxN matrix is ready!
     * <p>
     * * * *
     * * * *
     * * * *
     */
    public static void main(String[] args) {

        // todo: Write your code here!

        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO THE APPLICATION!");

        // take row size
        System.out.print("Enter row size: ");
        int row = sc.nextInt();

        // take column size
        System.out.print("Enter columns size: ");
        int columns = sc.nextInt();

        // generate NxN matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%s ", "*");
            }
            System.out.println();
        }
    }
}
