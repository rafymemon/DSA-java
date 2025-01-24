package InsertionSort;

import LinearSearch.range;
import java.util.*;

// Time complexity is O(n)
public class Insertion {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        insertionSort(arr);
        printArray(arr);

    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int previous = i - 1;
            // Finding out the correct position to insert
            while (previous >= 0 && arr[previous] > arr[current]) {
                arr[previous + 1] = arr[previous];
                previous = previous - 1;
            }
            // Insertion
            arr[previous + 1] = arr[current];
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
