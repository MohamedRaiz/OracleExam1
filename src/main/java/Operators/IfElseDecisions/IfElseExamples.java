package Operators.IfElseDecisions;

public class IfElseExamples {
    public static void main(String[] args) {
         boolean flag = false;
         boolean subflag = true;
         if (flag); //empty statement is valid, needs the semicolon tho.
         else System.out.println("1. flag is false");

         //Compiler formats code, indicating what is really going on.
        //however, look for similar code on exam where it is not formatted neatly for you.
        if(flag)
            if(subflag) System.out.println("2. Subflag is true");
            else
                System.out.println("2. Subflag is false");
        else
            System.out.println("2. flag is false");

        //Formatted to mislead..
        if (flag)
            if(subflag) System.out.println("3. Subflag is true");
        else System.out.println("3. flag is false"); //Dangling else. THis actually belongs to the nested if.

        subflag = false;
        if(flag)
            if(subflag) System.out.println("4. Subflag is true");
        else System.out.println("4. Subflag is false");
        else System.out.println("4. flag is false");

        //Very Common Mistake
        flag = false;
        if(flag = true) { //here, we see that it is an assignment not a check for equality
            System.out.println("5. Flag is true");
        } else System.out.println("5. Flag is false");

        //The following code testasd precedence/assignments inside an if/else statement.
        boolean a = false;
        boolean b = false;
        boolean c = false;

        if ((a=true) || (b=true) && (c = true))
            System.out.println(a + " " + b + " " + c + " ");
    }
}
