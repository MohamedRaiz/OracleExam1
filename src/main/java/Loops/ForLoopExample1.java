package Loops;

public class ForLoopExample1 {

    public static void main(String[] args) {
        System.out.println("-----Traditional For Looop ---------");
        for(int i = 0; i< args.length; i++) {
            System.out.println("Argument " + (i+1) + " = " + args[i]);
        }


        System.out.println("-----Enhanced For Loop------");
        int i = 0;
        for(String arg : args) {
            System.out.println("Argument " + (++i) + " = " + arg);
        }
    }
}
