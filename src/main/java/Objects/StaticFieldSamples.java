package Objects;

public class StaticFieldSamples {

    public static void main(String[] args) {
        SuperClass a, b, c;

        System.out.println(a = new SuperClass("a", "One"));
        System.out.println(b = new SuperClass("b", "Two"));
        System.out.println(c  = new SuperClass("c", "Three"));
        System.out.println("----------------------------");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

class SuperClass {
    static String name;
    String instanceNumber;

    @Override
    public String toString() {
        return "name:" + SuperClass.name + ", instanceName: " + this.instanceNumber ;
    }

    SuperClass(String name, String instanceNumber) {
        SuperClass.name = name;
        this.instanceNumber = instanceNumber;
    }
}
