package Arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayComparison {

    public static void main (String[] args) {
        //Set up some arrays for comparison
        String[] string1 = {"abc", "def", "ghi"};
        String[] copyOfFirstString = {"abc", "def", "ghi"};
        String[] string1Unsorted = {"ghi", "abc", "def"};
        String[] partialString1 = {"abc"};

        String firstStringReference[] = string1;

        //Create pass-through Lists from arrays to test List equality. (Convert Array to List)
        List<String> firstList = Arrays.asList(string1);
        List<String> secondList = Arrays.asList(copyOfFirstString);

        //First, compare arrays using object equals
        System.out.println("-------Object Equals--------");
        System.out.println("string1.equals(firstStringreference) = " + string1.equals(firstStringReference));
        System.out.println("string1.equals(copyOfFirstString) = " + string1.equals(copyOfFirstString));

        //Compare using Arrays Equal method
        System.out.println("\n------- Arrays Equal Method ------");
        System.out.println("Arrays.Equal(string1, copyOfFirstString) = " + Arrays.equals(string1, copyOfFirstString));
        System.out.println("Arrays.Equal(string1, firstStringReference) = " + Arrays.equals(string1, firstStringReference));
        System.out.println("Arrays.Equal(string1, stringUnsorted) = " + Arrays.equals(string1, string1Unsorted));

        //Looking at Arrays Compare method now...
        System.out.println("\n------Arrays.Compare Method------");
        System.out.println("Arrays.Compare(string1, copyOfFirstString) = " + Arrays.compare(string1, copyOfFirstString));
        System.out.println("Arrays.Compare(string1, string1Unsorted) = " + Arrays.compare(string1, string1Unsorted));
        System.out.println("Arrays.Compare(string1, firstStringReference) = " + Arrays.compare(string1, firstStringReference));
        System.out.println("Arrays.Compare(firstStringUnssorted, string1) = " + Arrays.compare(string1Unsorted, string1));
        System.out.println("Arrays.Compare(string1, partialString1) = " + Arrays.compare(string1, partialString1));
        System.out.println("Arrays.Compare(partialString1, string1) = " + Arrays.compare(partialString1, string1));

        //More examples of Compare method..
        System.out.println("\n ------ More Examples on Comapare Mehod ------");
        System.out.println("Arrays.Compare(string1,string1Unsorted) = " + Arrays.compare(string1, string1Unsorted));
        System.out.println("string1[0].compareTo(string1Unsorted[0]) = " + string1[0].compareTo(string1Unsorted[0]));

        //Comparing subsets of elements in Array
        System.out.println("\n Arrays.compare for Element Ranges");
        String[] stringArray = {"abc", "def", "ghi", "jkl", "mno", "xyz"};
        String[] stringArrayUnsorted = {"jkl", "xyz", "mno", "abc", "def", "ghi"};

        //We are going to comapre the first 3 elements of the ordered array with the last 3 elemejts of the unsorted. Techincally they are the same
        System.out.println("Arrays.compare(stringArray, 0 , 3, stringArrayUnsorted,3,6) = " +
                Arrays.compare(stringArray, 0 ,3, stringArrayUnsorted ,3, 6));
        //Interestingly, we do not need to specify the same number of elements.
        System.out.println("Arrays.compare(stringArray, 0 , 5, stringArrayUnsorted,3,6) = " +
                Arrays.compare(stringArray, 0 ,5, stringArrayUnsorted ,3, 6));

        //Comparing List
        System.out.println("\n ---- List.Equals-----");
        System.out.println("firstlist.equals(secondList) = " + firstList.equals(secondList));

    }
}
