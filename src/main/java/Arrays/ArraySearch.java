package Arrays;

import java.util.Arrays;
import java.util.List;

public class ArraySearch {
    public static void main (String[] args) {
        //Set up some array data so we can compare.
        String[] firstString = {"abc", "def","ghi","jkl"};
        String[] firstStringUnsortedDuplicated = {"def", "jkl", "abc", "jkl"};
        String[] partialFirstString = {"abc", "jkl"};

        //Create List from arrays to testasd the List search Methods.
        List<String> firstList = List.of(firstString);
        List<String> secondList = Arrays.asList(firstStringUnsortedDuplicated);

        System.out.println("----------Arrays binarySearch---------");
        //Look for jkl which is in array
        String search = "jkl";
        System.out.println("Arrays.binarySearch(firstString, \"jkl\") = " + Arrays.binarySearch(firstString, search));

        //Look for aaa which is not in array
        String searchAaa = "AAA";
        System.out.println("Arrays.binarySearch(firstString, \"AAA\") = " + Arrays.binarySearch(firstString, searchAaa));

        //Look for jkl of which there are two elements
        String searchjkl = "jkl";
        System.out.println("Arrays.binarySearch(firstStringUnsortedDuplicated, \"jkl\") = " + Arrays.binarySearch(firstStringUnsortedDuplicated, searchjkl));

        //look for abc in unsorted array
        String saerchabc = "abc";
        System.out.println("Arrays.binarySearch(firstStringUnsortedDuplicated, \"abc\") = " + Arrays.binarySearch(firstStringUnsortedDuplicated, searchjkl));


        System.out.println("-------Array Mismatch --------");
        //mismatchs returns the non-matching indexw where the prefix ends.
        System.out.println("Arrays.Mismatch(firstString, partialString) = " + Arrays.mismatch(firstString, partialFirstString));
        //Another Eg...
        System.out.println("Arrays.Mismatch(firstStringUnsortedDuplicates, new String[] {jkl, mno}) = " +
                Arrays.mismatch(firstStringUnsortedDuplicated, new String[] {"jkl", "mno"}));

        System.out.println("-----List Methods -------");
        //Does array contains def?
        System.out.println("firstList.containsAll(def) = " + firstList.contains("def"));

        //Does array contains elements in partial String??
        System.out.println("firstList.containsAll(Arrays.asList(partialFirstString)) = " + firstList.containsAll(Arrays.asList(partialFirstString)));

        //Create second list in  diff order
        String[] anotherUnsortedArray = {"jkl", "def", "abc", "ghi"};
        System.out.println("firstList.containsAll(Arrays.asList(anotherUnsortedArray)) = " + firstList.containsAll(Arrays.asList(anotherUnsortedArray)));

        //use indexOf to get first matching element
        System.out.println("secondList.indexOf(jkl) = " + secondList.indexOf("jkl"));

        //use of LastIndex of to get the last matching element
        System.out.println("secondList.lastIndexOf(jkl) = " + secondList.lastIndexOf("jkl"));






    }
}
