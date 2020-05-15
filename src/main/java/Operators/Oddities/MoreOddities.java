package Operators.Oddities;

public class MoreOddities {
    public static void main(String[] args){
        int number = 10;
        int result = 0;
        System.out.println("------First Test --------");
        //result = --number - number--;
        //result always resolves to 0.
        //Testing a couple of instances with a for loop.
        for(int i = 10; i<= 50; i+=10) {
            number = i;
            result = --number - number--;
            System.out.println("i = " + i + ", number = " + number + ", result = " + result);
        }

        System.out.println(" ---- Second Test -----");
        //int result = number-- - --number;
        //result is always 2 in this case.
        //Example test below
        for(int i = 10; i<=50; i+=10){
            number = i;
            result = number-- - --number;
            System.out.println("i = " + i + ", number = " + number + ", result = " + result);
        }

        System.out.println("------ Third Test -----");
        for(int i = 10; i<= 50; i +=10) {
            number = i;
            result = number-- - number++ * --number;
            System.out.println("i = " + i + ", number = " + number + ", result = " + result);

        }

        System.out.println("----- Fourth Test- ------");
        //(number--) == (number+=1);
        //evaluates to true.
        number = 10;
        Boolean isEqual = number-- == (number+=1);
        System.out.println("isEqual = " + isEqual + ", number = " + number);

    }
}
