package az.company.java_lessons.lesson_11.lesson;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.name = "Elshan";
        person.surname = "Xalili";
        person.age = 23;

        System.out.println(person.age + " " + person.name + " " + person.surname);
        person.read();
    }
}