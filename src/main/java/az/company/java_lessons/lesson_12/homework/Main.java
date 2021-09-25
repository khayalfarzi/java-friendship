package az.company.java_lessons.lesson_12.homework;

public class Main {

    public static void main(String[] args) {

        // describe pet and human classes objects
        Human gulsenem = new Human();
        gulsenem.name = "Gulsenem";
        gulsenem.surname = "Balayeva";
        gulsenem.dateOfBirth = (short) 1879;

        Human mohsun = new Human("Mohsun", "Balayev", (short) 1859);

        Human gulqember = new Human("Gulqember", "Balayev", (short) 1894, gulsenem, mohsun);
        System.out.println(gulqember);
    }
}
