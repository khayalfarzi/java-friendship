package az.company.java_lessons.lesson_6;

public class StringExample {

    public static void main(String[] args) {

        String str = "Hi guys";
        // x int ? double? string?
        String x = "zzcj,askfsjjn";

        byte b = 5;

        // 1
        String strP = "String pool example";
        // 2
        String strR = new String("String reference example");

        String a = "abc";
        String d = "cde";
        String c = "abc";

        String name = "Elshan";
        System.out.println("initial name: " + name);                                // Elshan
        System.out.println("length: " + name.length());                             // 6
        System.out.println("upper case: " + name.toUpperCase());                    // ELSHAN
        System.out.println("lower case: " + name.toLowerCase());                    // elshan
        System.out.println("contains : " + name.contains("h"));                     // true
        System.out.println("concat: " + name.concat(" Ibra"));                      // Elshan Ibra
        System.out.println("replace: " + name.replace("a", "X"));   // ElshXn
    }
}