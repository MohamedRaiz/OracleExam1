package Operators.SwitchExamples;

public class SwitchExampleEnum {
    enum Day {MONDAY , TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

    public static void main(String[] args) {
        for(Day d: Day.values()) {
            switch (d) {
                case MONDAY:
                case TUESDAY:
                case THURSDAY:
                case WEDNESDAY:
                    System.out.println(d +" is a working day");
                    break;
                case FRIDAY:
                    System.out.println("TGIF");
                    break;
                case SATURDAY:
                case SUNDAY:
                    System.out.println("It is wkends");
            }
        }
    }
}
