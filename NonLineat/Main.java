package NonLineat;

import java.util.Arrays;

public class Main {
    public static void main(String args[]) throws Exception
    {

        // Sorted Array
        int array[] = { 4,53,3,1,6,7,33,0,55,2,3,45,12 };

        Arrays.sort(array);

        System.out.println("Sorted Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // Using binarySearch to search for desired element
        int index = Arrays.binarySearch(array, 33);

        // Printing result
        if (index >= 0)
            System.out.println("Element 33 found at index: "
                    + index);
        else
            System.out.println("Element not found");
    }
}
