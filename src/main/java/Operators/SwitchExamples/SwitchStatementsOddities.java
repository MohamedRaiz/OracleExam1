package Operators.SwitchExamples;

public class SwitchStatementsOddities {
    public static void main (String... args) {
        byte[] bytes = {100, 103, 104, 107, 126};
        String caseAssignedValue = "";

        start_for:
        for(var i : bytes) {
            switch( i * 10 ) {
                case(1000) :
                case(1030) :
                case(1040) :
                    break;
                case(1070) :
                    caseAssignedValue = "Less than 1100";
                    break start_for;
                case(1260) :
                    caseAssignedValue = "Equals to 1260";

                    break;
            }
            System.out.println("Done processing i= " + i + ", caseAssignedValue = " + caseAssignedValue);
        }
    }
}
