public class PrintArgs {

    public static void main(String[] args) {
        System.out.println("Printing some Arguments in this code:");

        //Loop through arguments passed and print them
        for (int i =0; i< args.length; i ++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);

        }
    }
}
