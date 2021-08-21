package az.company.java_lessons.lesson_6;

public class MathExample {

    public static void main(String[] args) {
        System.out.println("sqrt: " + Math.sqrt(49));           // 7
        System.out.println("max: " + Math.max(23, 45));         // 45
        int min = Math.min(12, 13);
        System.out.println("min: " + min);                      // 12
        System.out.println("module: " + Math.abs(-126));        // 126
        System.out.println("random number: " + (int) (Math.random() * 1000));  // random number
    }
}
