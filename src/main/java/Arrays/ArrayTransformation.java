package Arrays;

import java.util.Arrays;

public class ArrayTransformation {
    public static void main (String... args) {
        System.out.println("----- Using Arrays.copyOf --------");

        //Create an Array of Integer
        Integer[] originalArray = new Integer[10];

        //Initialize array from 1 to 10.
        Arrays.setAll(originalArray, (index) -> index + 1);
        System.out.println("Original Array Index Values are : " + Arrays.toString(originalArray));

        //Now we will create a copy of the Integer Array
        Integer[] copyArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("CopiedArray values are : " + Arrays.toString(copyArray));

        //Now create a copy Trimmed
        Integer[] trimmedArray = Arrays.copyOf(originalArray, 7);
        System.out.println("Trimmed array values are : " + Arrays.toString(trimmedArray));

        //A Copy of a wider array
        Integer[] widenedArray = Arrays.copyOf(originalArray, 15);
        System.out.println("Widened Array values are : " + Arrays.toString(widenedArray));

        //Create a copy of a defined range
        Integer[] croppedArray = Arrays.copyOfRange(originalArray, 2, 6);
        System.out.println("Cropped Array values are : " + Arrays.toString(croppedArray));

        croppedArray[0] = 5;
        System.out.println("Cropped array after change index 0 : " + Arrays.toString(croppedArray));





    }
}
