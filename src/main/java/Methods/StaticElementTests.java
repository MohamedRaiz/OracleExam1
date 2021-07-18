package Methods;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
Sub-Topic: static keyword
*/

import java.util.List;

// This class demonstrates static fields, a static initializer, and
// a static method
class StaticStuff {
    static final String appName = "A Good App";

    // static initializer
    static {
        System.out.println("Initializing StaticStuff class");
        StaticStuff.counter++;
    }

    static void printAppName() {
        System.out.println("Application Name:  " + appName +
                " : counter  = " + counter);
    }

    static int counter;
}

public class StaticElementTests {
    public static void main(String[] args) {

        List<String> stringTest = null;

        for (String test : stringTest) {
            System.out.println(test);
        }

        //Here, we added this to prove that the StaticStuff is not initialized upon start but when the static method is called below.
        for (int i = 0; i < 3; i++) {
            System.out.println("Printing : " + i);
        }

        //To testasd what happens what we initialize a class.
//        StaticStuff s = new StaticStuff();
//        System.out.println("Created an instance of StaticStuff");

        //We Declare an object but dont instantiate
//        StaticStuff s = null;

//        // We access static member of the StaticStuff class
//        System.out.println("Application Name: " + s.appName);
//
//        int myCounter = StaticStuff.counter;
//        System.out.println("myCounter : " + myCounter);

        //Executing printAppName.
//        s.printAppName();

        //New Code
        StaticStuff s = new StaticStuff();
        System.out.println("Created an instance of StaticStuff");
        s.printAppName();

        StaticStuff s0 = new StaticStuff();
        System.out.println("Created a 2nd instance of StaticStuff");
        s0.printAppName();

        StaticStuff s1 = new StaticStuff();
        System.out.println("Created a 3rd instance of StaticStuff");
        s1.printAppName();
    }
}
