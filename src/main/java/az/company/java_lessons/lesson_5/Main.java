package az.company.java_lessons.lesson_5;

public class Main {

    public static void main(String[] args) {
        boolean bool = true;
        byte b = 23;
        short sh = 45;
        char ch = 'X';
        int i = 78;
        double d = 56.65;
        float ft = (float) 99.98;
        long l = 101;

        System.out.printf("byte and short ac : %s", (b + sh));
        byte c = (byte) (b + sh);
    }
}