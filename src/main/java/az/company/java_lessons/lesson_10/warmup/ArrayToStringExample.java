package az.company.java_lessons.lesson_10.warmup;

public class ArrayToStringExample {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        String toString = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == (args.length - 1)) {
                toString = " " + toString + arr[i] + " ";
            } else
                toString = " " + toString + arr[i] + ",";
        }
        toString = toString + "]";

        System.out.printf("formatted to string method: %s", toString);
    }
}
