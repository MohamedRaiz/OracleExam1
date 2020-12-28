package Objects;

class OrderedClass {
    static int statementOrder;

    int a = clarify("Assigning A");

    //Initializer 1
    {
        clarify("Initializer 1");
    }

    int b = clarify("Assigning B");

     int clarify(String stringMessage) {
         statementOrder++;
         System.out.println(statementOrder + " " + stringMessage);
         return statementOrder;
    }

    //Initializer 2
    {
        clarify("Initializer 2");
    }

    OrderedClass () {
        clarify("Constructor");
    }

    int c = clarify("assigning c");

    //Initializer 3
    {
        clarify("initializer 3");
    }
}


public class InitializeOrder {
    public static void main(String[] args) {
        OrderedClass o = new OrderedClass();

    }
}
