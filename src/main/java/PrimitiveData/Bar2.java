package PrimitiveData;

public class Bar2 {
    public static void main(String[] args) {

        // define local variables for all primitive data types
        byte mainByte;
        char mainChar;
        short mainShort;
        int mainInt;
        long mainLong;
        float mainFloat;
        double mainDouble;
        boolean mainBoolean;

        System.out.println("Local variables in a main method");

        //Comment this out to see that if not initialize will give error
        System.out.println("Initializing Variables now");
        mainByte = 0;
        mainChar = 'A';
        mainShort = 1;
        mainInt = 2;
        mainLong = 3L;
        mainFloat = 4f;
        mainDouble = 5.0D;
        mainBoolean = true;

        //Adding statements to try and use them.
        System.out.println("Are local variables set to default values?");
        System.out.println("mainByte = " + mainByte);
        System.out.println("mainChar = " + mainChar);
        System.out.println("mainFloat = " + mainFloat);
        System.out.println("mainShort = " + mainShort);
        System.out.println("mainInt = " + mainInt);
        System.out.println("mainLong = " + mainLong);
        System.out.println("mainDouble = " + mainDouble);
        System.out.println("mainBoolean = " + mainBoolean);
    }
}
