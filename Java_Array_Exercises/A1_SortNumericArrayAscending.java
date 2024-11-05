package Java_Array_Exercises;

import java.util.Arrays;

public class A1_SortNumericArrayAscending {
    public static void main(String[] args) {

        int[] arr = { 23, 5, 67, 20, 3, 30, 79, 3, 70, 2 };

        System.out.println("Array before sorting: " + Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println("Array after sorting: " + Arrays.toString(arr));

    }
}
