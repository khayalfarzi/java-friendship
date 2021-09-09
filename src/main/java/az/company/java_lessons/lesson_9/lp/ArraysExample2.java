package az.company.java_lessons.lesson_9.lp;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Application! ");

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number: ");
            int number = sc.nextInt();
            arr[i] = number;
        }

        System.out.printf("Your array is : %s", Arrays.toString(arr));
    }
}
