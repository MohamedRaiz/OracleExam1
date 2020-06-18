package Loops;

public class ForLoopExample2 {
    public static void main(String... args) {
        //You cannot reference a label inside a for loop that is not
        // associated to the for loop, unless the for loop is nested
        int i = 0;
        int j = 2;
        int jmax = 4;
        OUTERLABEL:
        for(i = 0; i<=4; i++) {
            System.out.println("i = " + i + " first statement");
            if(i == 0) {
                System.out.println("\t i = " + i + ", Continue Outer Label");
                continue OUTERLABEL;
            }
            INNERLABEL:
            for(j=0; j<=3; j++) {
                System.out.println("\t\tj = " + j + " First");
                if(i == 1 && j == 0) {
                    System.out.println("\t\t\tj = " + j + ", Continue Inner Label");
                    continue INNERLABEL;
                }
                if(i ==2 && j == 1){
                    System.out.println("\t\t\tj = " + j + ", Break Inner Label" );
                    //Here we are breaking inner label
                    break INNERLABEL;
                }
                if(i == 3 && j == 2) {
                    System.out.println("\t\t\t j = " + j + ", Break Outer Label");
                    //Here we break outer label
                    break OUTERLABEL;
                }
                System.out.println("\t\tj = " + j + " Last");
            }
            System.out.println("i = " + i + " Last Statment");

        }
        System.out.println("Outside of Loops: i = " + i + ", j = " + j );

    }
}
