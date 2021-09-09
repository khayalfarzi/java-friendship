package az.company.java_lessons.lesson_9.lp;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int c = 98;

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 98;
        arr[4] = 128;

        System.out.printf("Full array: %s", Arrays.toString(arr)); // [5, 3, 98, 0, 128]
        System.out.printf("2'nd index: %s", arr[2]);
    }
}
