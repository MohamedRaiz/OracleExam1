package StringsZ;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Create and Manipulate Strings
Sub-Topic: Recap
*/

public class Recap {
    public static void main(String[] args) {
        EqualLiteralReferences();
        System.out.println("\nNow for the StringConstructors Method\n");
        StringConstructors();
        System.out.println("\nNow for the StringConstructorsInterned Method\n");
        StringConstructorsInterned();
    }

    public static void EqualLiteralReferences() {
        // String literals automatically interned so all "hello" literals
        // point to same reference in memory, in the string pool
        String s1 = "hello";

        String s2 = "hello";
        System.out.println("s1 and s2 are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));

    }


    public static void StringConstructors() {
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println("s1 and s2 are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));
    }

    public static void StringConstructorsInterned() {
        //Here, we add the intern() method. Intern checks the string pool
        // and returns the string pool reference to s1
        String s1 = new String("Hello").intern();
        String s2 = new String("Hello").intern();

        System.out.println("s1 and s2 are string literals " +
                "assigned to String variables: (s1 == s2) = " +
                ((s1 == s2) ? "true" : "false"));
    }

}
