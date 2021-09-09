package az.company.java_lessons.lesson_9.warmup;

public class EqualNumbersExercise {

    // https://github.com/khayalfarzi/java-SE-syllabus/blob/main/6%20Java%20Loops/Exercise.md
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        if ((i + j) == (k + l)) {
                            String number = String.format("%s%s%s%s", i, j, k, l);
                            System.out.println(number);
                        }
                    }
                }
            }
        }
    }
}
