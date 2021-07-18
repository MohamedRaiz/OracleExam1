package Arrays;

import java.util.Arrays;
import java.util.List;

public class ListDataManipulation {
    public static void main(String[] args) {

        //Some testasd data for array
        String[] primaryColour = {"Red", "Blue", "Yellow"};
        String[] secondaryColour = {"Green", "Orange", "Purple"};

        System.out.println("---- Manipulating Array using a List, backed by an Array");
        List<String> colorList = Arrays.asList(primaryColour);
        System.out.println("colorList = " + colorList.toString());

        //Use of get to get an element in array.
        String firstColor = colorList.get(0);
        System.out.println("First color = " + firstColor);

        //Sort List
        colorList.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("List after sorting = " + colorList.toString());

        System.out.println("PrimaryColors = " + Arrays.toString(primaryColour));

        colorList.set(0, "Cyan");
        System.out.println("After setting at index 0 = " + colorList.toString());
        System.out.println("Original array now becomes = " + Arrays.toString(primaryColour));

        //USE OF replaceAll method in List.
        colorList.replaceAll(word -> word + "ish");
        System.out.println("After replacing s with s+ish = " + colorList.toString());
        System.out.println("Original Array now becomes = " + Arrays.toString(primaryColour));

        System.out.println("\nExamples on List.Of and List.CopyOf methods ");
        //List.of method can take in an array and make it into an immutable list.
        List<String> secondColorList = List.of(primaryColour);

        //List.CopyOf method takes a list and makes another list.
        List<String> thirdColorList = List.copyOf(Arrays.asList(primaryColour));

        System.out.println("SecondColorList = " + secondColorList.toString());
        System.out.println("ThirdColorList = " + thirdColorList.toString());

        //Change value in original array
        primaryColour[0] = "blue";

        System.out.println("\nPrimarycolour after making index 0 blue = " + Arrays.toString(primaryColour));
        System.out.println("SecondColorList after primarycolor change = " + secondColorList.toString());
        System.out.println("Thirdcolorlist after priamry color change = " + thirdColorList.toString());



    }
}
