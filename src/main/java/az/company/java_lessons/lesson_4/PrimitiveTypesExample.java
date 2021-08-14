package az.company.java_lessons.lesson_4;

public class PrimitiveTypesExample {

    public static void main(String[] args) {

        // 8 types

        // 1) byte      [-128 - 127]
        // 2) short     [-32,768 - 32,767]
        // 3) char
        // 4) int       [-2,147,483,648 - 2,147,483, 647]
        // 5) double    [±1.79769313486231570E+308 ]
        // 6) float     [±3.40282347E+38F]
        // 7) boolean
        // 8) long      [-9,223,372,036,854,775,808 - 9,223,372,036,854,775,807]

        char chEx = 'C';
        String strEx = "Hello";
        System.out.println(chEx);

        boolean boolEx = true;
        System.out.println(boolEx);

        byte byEx = 25;
        System.out.println(byEx);

        short shEx = 1500;
        System.out.println(shEx);

        int iEx = 1_000_000;
        System.out.println(iEx);

        long lEx = 1_000_000_000;
        System.out.println(lEx);

        byte a = 5;
        byte b = 8;
        int c = a + b;
        System.out.println(c);
    }
}
