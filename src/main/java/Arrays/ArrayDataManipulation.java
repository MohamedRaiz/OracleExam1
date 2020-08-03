package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayDataManipulation {

    public static void main(String[] args) {
        System.out.println("Manipulating Data in Array with Static Methods");

        //Create an Array of Integer
        Integer[] intArray = new Integer[10];
        System.out.println("Array values initially : " + Arrays.toString(intArray));

        //Filling an array with a single value
        Arrays.fill(intArray, 5);
        System.out.println("Array value after fill : " + Arrays.toString(intArray));

        //You can also fill a partial range with Arrays. This is within the fill overloaded method.
        int partialValueFill = 9;
        Arrays.fill(intArray, 5, 10, partialValueFill);
        System.out.println("Array values after partial fill : " + Arrays.toString(intArray));

        //setAll Method was introduced in Java8. Using Lambda expression.
        Arrays.setAll(intArray, (a) -> a + 1);
        System.out.println("Arrays values after setAll : " +  Arrays.toString(intArray));

        //Sort non primitive data type arrays in reverse this way
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("Arrays value after reverse sort : " + Arrays.toString(intArray));

        //Similar to setAll and parallelSetAll, except this method supports binary Operation
        Arrays.parallelPrefix(intArray, (left, right) -> left + right);
        System.out.println("Arrays value after parallelPrefix : " + Arrays.toString(intArray));
    }
}
