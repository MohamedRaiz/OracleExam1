package Operators.SwitchExamples;

public class SwitchExampleFallThru {
    public static void main(String... args) {
        String[] strs = {"A", "B", "C", "D"};
        //This example of the switch statement will demonstrate a fallthrough
        // and the default label is not in the last position
        int iteration = 0;
        for(String s: strs){
            System.out.println("------Iteration " + ++iteration + ", s = " + s + "--------");

            switch(s) {
                case "A" :
                    System.out.println("Do A");
                default :
                    System.out.println("Doing Default");
                case "B" :
                    System.out.println("Do B");
                case "C" :
                    System.out.println("Do C");

            }
        }
    }
}
