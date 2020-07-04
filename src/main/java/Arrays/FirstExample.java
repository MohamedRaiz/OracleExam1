package Arrays;

import java.util.Arrays;

public class FirstExample {

    public static void main (String[] args) {
        //Creating 2 arrays, One of Integer, one of int.

        //Elements initialized to null automatically with size 5 in this case.
        Integer[] integerArray = new Integer[5];
        //Initialized to 0 as it is a primitive with size 5 too.
        int[] intArray = new int[5];

        System.out.println("-----Default Values -------");
        //This method prints elements as comma delimited.
        System.out.println("integerArray : " + Arrays.toString(integerArray));
        System.out.println("intArray : " + Arrays.toString(intArray));

        //This method will give you the object reference number instead of values.
        System.out.println(integerArray.toString());

        for (int i = 0; i<intArray.length; i ++ ) {

            //Set data on arrays, autoboxing occurs for integerArray
            integerArray[i] = intArray[i] = (i + 1);
        }
        System.out.println("------Values After Looping --------");
        System.out.println("integerArray: " + Arrays.toString(integerArray));
        System.out.println("intArray: " + Arrays.toString(intArray));

        //Accessing a single Element in Array
        intArray[2] = 10;
        integerArray[4] = 999;

        System.out.println("Final Values");
        System.out.println("integerArray : " + Arrays.toString(integerArray));
        System.out.println("intArray: " + Arrays.toString(intArray));

        //Create new int[] variable reference and assign it intArray.
        int[] intArray2 = intArray;

        //Create new Integer[] variable reference and assign it intArray.
        Integer[] integerArray2 = integerArray;

        System.out.println("-----Print Arrays ------");
        System.out.println("intArray: " + intArray);
        System.out.println("integerArray: " + integerArray);
        System.out.println("intArray2 : " + intArray2);
        System.out.println("integerArray2 : " + integerArray2);

        //Make changes to first array
        integerArray[0] = 55;
        intArray[0] = 66;

        //Make changes to 2nd Array
        intArray2[1] = 77;
        integerArray2[1] = 66;

        System.out.println("Print Array Values");
        System.out.println("intArray: " + Arrays.toString(intArray));
        System.out.println("integerArray: " + Arrays.toString(integerArray));
        System.out.println("intArray2 : " + Arrays.toString(intArray2));
        System.out.println("integerArray2: " + Arrays.toString(integerArray2));



    }
}
