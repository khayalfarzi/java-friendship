package az.company.java_lessons.lesson_10.ls;

public class MethodExample {

    public static void main(String[] args) {
        methodOne();
        String mt = methodTwo();
        System.out.println(mt);
        methodThree(5);
        int apples = methodFour(5); // 10
        System.out.println(apples);

        System.out.println(Math.max(5, 3));

        System.out.println(calculateSqrt(25));
    }

    public static double calculateSqrt(double element) {
        return Math.sqrt(element);
    }

    public static void methodOne() {
        System.out.println("Method one example");
        System.out.println("...");
        System.out.println("loading...");

        int a = 5, b = 6, c = a + b;
        System.out.println(c);
    }

    public static String methodTwo() {
        return "Hi java methods example";
    }

    public static void methodThree(int element) {
        element = element * 2 * 5 * 8 * 9;
        System.out.println(element);
    }

    public static int methodFour(int apple) {
        int element = apple * 2;
        return element;
    }
}